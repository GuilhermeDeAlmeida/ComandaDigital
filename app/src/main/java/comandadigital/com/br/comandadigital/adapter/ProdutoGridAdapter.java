package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.model.Produto;

/**
 * Created by Andressa on 28/05/2017.
 */

public class ProdutoGridAdapter extends BaseAdapter{

    private final List<Produto> produtos;
    private final Activity activity;

    public ProdutoGridAdapter(List<Produto> produtos, Activity activity) {
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
        View view = activity.getLayoutInflater().inflate(R.layout.grid_item_produto, parent, false);
        Produto produto = produtos.get(position);
        //view.setLayoutParams(ViewGroup.center);

        TextView nomeProduto = (TextView) view.findViewById(R.id.textViewNomeProduto);
        TextView preco = (TextView) view.findViewById(R.id.textViewPrecoProduto);

        nomeProduto.setText(produto.getNome());
    String pre = "R$ " + limitarCasasDecimais(produto.getPreco());
        preco.setText(pre);

        return view;
    }

    //esse método não pode ficar aqui
    public String limitarCasasDecimais(Double valor){
        DecimalFormat df = new DecimalFormat("#0,00");
        df.format(valor);
        return "" + valor;
    }
}
