package tecsup.com.municipalalerts.business;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import tecsup.com.municipalalerts.R;
import tecsup.com.municipalalerts.models.Noticia;

/**
 * Created by Steph on 24/05/2017.
 */

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder> {

private List<Noticia> noticias;


public NoticiasAdapter(List<Noticia> noticias){

    this.noticias = noticias;
        }

public class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView picture;
    public TextView title;
    public TextView date;



    public ViewHolder(View itemView) {
        super(itemView);
        picture = (ImageView) itemView.findViewById(R.id.noticia_image);
        title = (TextView) itemView.findViewById(R.id.noticia_title);
        date = (TextView) itemView.findViewById(R.id.noticia_date);

    }
}

    @Override
    public NoticiasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticias, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NoticiasAdapter.ViewHolder viewHolder, int position) {
        final Noticia noticia = this.noticias.get(position);
       /*  viewHolder.title.setText(noticia.getTitle());
        viewHolder.date.setText(noticia.getDate());
       viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(v.getContext());
                builder.setTitle(noticia.getTitle());
                builder.setIcon(R.drawable.news);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
*/
     //   Context context = viewHolder.itemView.getContext();
      //  int idRes = context.getResources().getIdentifier(noticia.getPicture(), "drawable", context.getPackageName());
       // viewHolder.picture.setImageResource(idRes);

    }

    @Override
    public int getItemCount() {
        return this.noticias.size();
    }

}

