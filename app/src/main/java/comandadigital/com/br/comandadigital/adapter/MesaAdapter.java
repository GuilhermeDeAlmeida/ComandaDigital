package comandadigital.com.br.comandadigital.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.controller.SelecaoMesa;
import comandadigital.com.br.comandadigital.model.Estabelecimento;
import comandadigital.com.br.comandadigital.model.Mesa;

import static comandadigital.com.br.comandadigital.R.mipmap.ic_launcher;

/**
 * Created by guilh on 22/05/2017.
 */

public class MesaAdapter  extends BaseAdapter {
    private final List<Mesa> mesas;
    private final Activity activity;

    public MesaAdapter(List<Mesa> mesas, Activity activity) {
        this.mesas = mesas;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return mesas.size();
    }

    @Override
    public Object getItem(int position) {
        return mesas.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_item_mesa, parent, false);
        Mesa mesa = mesas.get(position);

        TextView numeroMesa = (TextView) view.findViewById(R.id.txtNumeroMesa);
        TextView status   = (TextView) view.findViewById(R.id.txtStatus);
        TextView quantidadeLugares = (TextView) view.findViewById(R.id.txtQuantidadeLugares);
        TextView descricaoLugar = (TextView) view.findViewById(R.id.txtDescricaoLugar);

        numeroMesa.setText("Mesa: " + mesa.getCodigoMesa().toString());
        status.setText(mesa.getStatus().toString());
        quantidadeLugares.setText(Integer.toString(mesa.getCapacidade()) + " lugares");
        descricaoLugar.setText(mesa.getFinalidade());

        return view;
    }
}
