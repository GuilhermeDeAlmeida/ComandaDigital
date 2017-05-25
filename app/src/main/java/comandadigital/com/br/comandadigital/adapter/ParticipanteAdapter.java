package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.model.Cliente;

import static android.R.drawable.ic_input_add;
import static comandadigital.com.br.comandadigital.R.mipmap.ic_launcher;

/**
 * Created by pettercosta on 24/05/17.
 */

public class ParticipanteAdapter extends BaseAdapter {
    private final List<Cliente> clientes;
    private final Activity activity;

    public ParticipanteAdapter(List<Cliente> clientes, Activity activity) {
        this.clientes = clientes;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return clientes.size();
    }

    @Override
    public Object getItem(int i) {
        return clientes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_item_participante, parent,false);

        Cliente cliente = (Cliente) getItem(i);

        ImageView imgParticipante = (ImageView) view.findViewById(R.id.imageParticipante);
        TextView textNome = (TextView) view.findViewById(R.id.textViewNomeParticipante);
        ImageView imgAdicionar = (ImageView) view.findViewById(R.id.imageAdicionar);

        imgParticipante.setImageResource(ic_launcher);
        textNome.setText(cliente.getNome());
        imgAdicionar.setImageResource(ic_input_add);

        return view;
    }
}
