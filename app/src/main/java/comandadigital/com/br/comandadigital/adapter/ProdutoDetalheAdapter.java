package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.model.Componente;

import static comandadigital.com.br.comandadigital.R.layout.lista_item_opcional;

/**
 * Created by Andressa on 03/09/2017.
 */

public class ProdutoDetalheAdapter extends BaseAdapter {

    private final List<Componente> componentes;
    private final Activity activity;
    ImageButton imageButtonOpcional;
    private boolean amarelo;

    public ProdutoDetalheAdapter(List<Componente> componentes, Activity activity) {
        this.componentes = componentes;
        this.activity = activity;
        amarelo = false;
    }

    @Override
    public int getCount() {
        return componentes.size();
    }

    @Override
    public Object getItem(int position) {
        return componentes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_item_opcional, parent, false);
        Componente componente = componentes.get(position);

        TextView nomeOpcional = (TextView) view.findViewById(R.id.textViewNomeOpcional);
        imageButtonOpcional = (ImageButton) view.findViewById(R.id.imageButtonOpcional);
        nomeOpcional.setText(componente.getNome());

        mudarIcone(componente);

        return view;
    }

    public void mudarIcone(Componente componente) {
        imageButtonOpcional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amarelo) {
                    imageButtonOpcional.setBackgroundResource(R.mipmap.indifferent);
                    amarelo = false;
                } else {
                    imageButtonOpcional.setBackgroundResource(R.mipmap.happiness);
                    amarelo = true;
                }
            }
        });
    }
}
