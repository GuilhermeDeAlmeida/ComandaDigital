package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ProdutoAdapter;
import comandadigital.com.br.comandadigital.model.ProdutoEstabelecimento;

/**
 * Created by Andressa on 20/05/2017.
 */

public class ListaProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        ListView listaProdutos = (ListView)findViewById(R.id.lista_produtos);
        List<ProdutoEstabelecimento> produtos = todosOsProdutos();
        ProdutoAdapter adapter = new ProdutoAdapter(produtos, this);
        listaProdutos.setAdapter(adapter);
    }

    //método abaixo abre a tela de produto. Ainda não está sendo puxado em lugar nenhum
    public void exibirProduto(){
        Intent intent = new Intent(ListaProdutos.this, DetalheProduto.class);
        startActivity(intent);
    }

    /*
    *
    *
    *
    * @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        String foto;
        try {
            foto = fotos.get(position);
        } catch (IndexOutOfBoundsException e) {
            foto = fotos.get(0);
        }

        final ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setTransitionName("itemProductPhoto");
        }

        final String finalFoto = foto;

        Picasso.with(mContext)
                .load(finalFoto)
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .resize(0, HEIGHT)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                        Picasso.with(mContext)
                                .load(finalFoto)
                                .networkPolicy(NetworkPolicy.OFFLINE)
                                .resize(0, HEIGHT)
                                .into(imageView, new Callback() {

                                    @Override
                                    public void onSuccess() {
                                    }

                                    @Override
                                    public void onError() {

                                        Picasso.with(mContext)
                                                .load(finalFoto)
                                                .resize(0, HEIGHT)
                                                .into(imageView, new Callback() {

                                                    @Override
                                                    public void onSuccess() {

                                                    }

                                                    @Override
                                                    public void onError() {

                                                        Picasso.with(mContext)
                                                                .load(R.mipmap.ic_launcher)
                                                                .resize(0, HEIGHT)
                                                                .into(imageView);

                                                    }
                                                });

                                    }
                                });

                    }
                });



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ProdutoZoomActivity.class);
                i.putExtra("fotos", (Serializable) fotosHd);
                i.putExtra("index", position);
                mContext.startActivity(i);
            }
        });

        container.addView(itemView);

        return itemView;
    }
    *
    *
    * */




    //only for test
    private List<ProdutoEstabelecimento> todosOsProdutos() {
        List<ProdutoEstabelecimento> list = new ArrayList<>();
        ProdutoEstabelecimento p1 = new ProdutoEstabelecimento();
        ProdutoEstabelecimento p2 = new ProdutoEstabelecimento();
        ProdutoEstabelecimento p3 = new ProdutoEstabelecimento();

        p1.setNome("Hambúrguer");
        p1.setPreco(new BigDecimal(29.9));

        p2.setNome("Salada");
        p2.setPreco(new BigDecimal(8.9));

        p3.setNome("Café");
        p3.setPreco(new BigDecimal(4.90));


        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }
}
