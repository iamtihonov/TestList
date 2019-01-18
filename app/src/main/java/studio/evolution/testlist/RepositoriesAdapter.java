package studio.evolution.testlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RepositoriesAdapter extends RecyclerView.Adapter<RepositoryItemHolder> {

    private String[] array = new String[1000];

    RepositoriesAdapter() {
        for (int i = 0; i < 1000; i++) {
            array[i] = "Repository " + (i + 1);
        }
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
        itemHolder.textRepositoryName.setText(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }
}
