package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<SliderAnimals> listItems;
    private ViewPager2 viewPager;

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.slide_animals,
                parent,
            false
        )
        );
    }

    public SliderAdapter(List<SliderAnimals> listItems, ViewPager2 viewPager) {
        this.listItems = listItems;
        this.viewPager = viewPager;
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position)
    {
        holder.setImageView(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class SliderViewHolder  extends RecyclerView.ViewHolder{
        private RoundedImageView imageView;



        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.animalsSlider);

        }
        void setImageView(SliderAnimals sliderItem){

            imageView.setImageResource(sliderItem.getImage());
        }
    }
}
