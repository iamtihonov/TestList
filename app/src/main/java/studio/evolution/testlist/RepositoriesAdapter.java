package studio.evolution.testlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RepositoriesAdapter extends RecyclerView.Adapter<RepositoryItemHolder> {

    RepositoriesAdapter() {
        Log.d("testLog", "RepositoriesAdapter()");
    }


    @NonNull
    @Override
    public RepositoryItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_repository,
                parent, false);
        return new RepositoryItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RepositoryItemHolder itemHolder, int position) {
        itemHolder.textRepositoryName.setText(String.format("Repository %1$s", position));
    }

    @Override
    public int getItemCount() {
        return 1000;
    }
}
