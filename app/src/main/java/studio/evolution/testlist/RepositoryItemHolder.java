package studio.evolution.testlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class RepositoryItemHolder extends RecyclerView.ViewHolder {
    TextView textRepositoryName;

    RepositoryItemHolder(View itemView) {
        super(itemView);
        textRepositoryName = itemView.findViewById(R.id.text_repository_name);
    }
}
