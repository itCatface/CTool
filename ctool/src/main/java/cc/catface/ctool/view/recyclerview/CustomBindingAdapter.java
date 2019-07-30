package cc.catface.ctool.view.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by catfaceWYH --> tel|wechat|qq 130 128 92925
 */
public abstract class CustomBindingAdapter<B extends ViewDataBinding> extends RecyclerView.Adapter<CustomBindingAdapter.Holder<B>> {
    @NonNull @Override public Holder<B> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        B binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId(), parent, false);
        Holder<B> holder = new Holder<>(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override public void onBindViewHolder(@NonNull Holder<B> holder, int position) {
        onBindHolder(holder.getBinding(), position);
    }


    static class Holder<B> extends RecyclerView.ViewHolder {
        private B binding;

        Holder(@NonNull View itemView) {
            super(itemView);
        }

        B getBinding() {
            return binding;
        }

        void setBinding(B binding) {
            this.binding = binding;
        }
    }


    public abstract int layoutId();

    public abstract void onBindHolder(B binding, int position);
}
