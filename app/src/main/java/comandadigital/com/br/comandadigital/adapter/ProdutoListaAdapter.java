package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.model.ProdutoEstabelecimento;

/**
 * Created by Andressa on 21/05/2017.
 */

public class ProdutoListaAdapter extends BaseAdapter{

    private final List<ProdutoEstabelecimento> produtos;
    private final Activity activity;

    public ProdutoListaAdapter(List<ProdutoEstabelecimento> produtos, Activity activity) {
        this.produtos = produtos;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_item_produto, parent, false);
        ProdutoEstabelecimento produto = produtos.get(position);

        TextView nomeProduto = (TextView) view.findViewById(R.id.textViewNomeProduto);

        TextView preco = (TextView) view.findViewById(R.id.textViewPrecoProduto);

        nomeProduto.setText(produto.getNome());
        preco.setText("R$ " + produto.getPreco());

        return view;
    }
}
