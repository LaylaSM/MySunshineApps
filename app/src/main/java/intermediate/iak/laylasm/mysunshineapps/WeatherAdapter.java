package intermediate.iak.laylasm.mysunshineapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather, parent, false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final ImageView mWeatherImage;
        private final TextView mWeatherDate;
        private final TextView mWeatherDesc;
        private final TextView mWeatherTemp;
        private final CardView mWeatherCardView;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            mWeatherImage = (ImageView) itemView.findViewById(R.id.img_adapter_weather);
            mWeatherDate = (TextView) itemView.findViewById(R.id.txt_adapter_weather_date);
            mWeatherDesc = (TextView) itemView.findViewById(R.id.txt_adapter_weather_desc);
            mWeatherTemp = (TextView) itemView.findViewById(R.id.txt_adapter_weather_temp);
            mWeatherCardView = (CardView) itemView.findViewById(R.id.cv_adapter_weather);

            mWeatherCardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Posisi ke " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext(),DetailActivity.class);
            v.getContext().startActivity(intent);
        }
    }
}
