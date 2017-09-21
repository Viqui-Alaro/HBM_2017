package hansa.com.bo.hbm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * Created by VAlaro on 20/9/2017.
 */


public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{


    ArrayList<MenuHansa> listaMenu;

    public AdapterDatos(ArrayList<MenuHansa> listaMenu) {
        this.listaMenu = listaMenu;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        /*
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,null,false);
        */

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grid_menu,null,false);


        return new ViewHolderDatos(view);
    }


    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.etinombre.setText(listaMenu.get(position).getNombre());
        holder.foto.setImageResource(listaMenu.get(position).getFoto());
    }

    @Override
    public int getItemCount() {

        return listaMenu.size();
    }



    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView etinombre;
        ImageView foto;


        public ViewHolderDatos(View itemView) {
            super(itemView);
            etinombre = (TextView) itemView.findViewById(R.id.txtDato);
            foto = (ImageView) itemView.findViewById(R.id.imgPrueba);
        }


    }

}
