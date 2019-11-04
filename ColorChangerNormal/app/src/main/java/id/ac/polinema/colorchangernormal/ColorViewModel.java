package id.ac.polinema.colorchangernormal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ColorViewModel extends AndroidViewModel {

    private int color = 0xfff;

    public ColorViewModel(@NonNull Application application) {
        super(application);
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
