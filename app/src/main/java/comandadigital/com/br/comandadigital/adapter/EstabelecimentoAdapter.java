package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.model.Estabelecimento;

import static comandadigital.com.br.comandadigital.R.mipmap.ic_launcher;

/**
 * Created by guilh on 12/05/2017.
 */

public class EstabelecimentoAdapter extends BaseAdapter{

    private final List<Estabelecimento> estabelecimentos;
    private final Activity activity;

    public EstabelecimentoAdapter(List<Estabelecimento> estabelecimentos, Activity activity) {
        this.estabelecimentos = estabelecimentos;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return estabelecimentos.size();
    }

    @Override
    public Object getItem(int position) {
        return estabelecimentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_item_estabelecimento, parent, false);
        Estabelecimento estabelecimento = estabelecimentos.get(position);

        TextView nomeEstabelecimento = (TextView) view.findViewById(R.id.textViewNomeEstabelecimento);

        TextView endereco = (TextView) view.findViewById(R.id.textViewDistancia);

        TextView abertura   = (TextView) view.findViewById(R.id.textViewAbertura);

        TextView fechamento = (TextView) view.findViewById(R.id.textViewFechamento);

        ImageView imageIcon = (ImageView) view.findViewById(R.id.imageViewIcon);

        nomeEstabelecimento.setText(estabelecimento.getNome());
        endereco.setText(estabelecimento.getLocalizacao());
        abertura.setText(estabelecimento.getHorarioAbertura());
        fechamento.setText(estabelecimento.getHorarioFechamento());
        imageIcon.setImageResource(ic_launcher);


        return view;
    }

}
