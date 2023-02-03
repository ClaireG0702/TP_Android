package fr.iut_fbleau.dessin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

public class Gribouillage extends View {
    private Paint paintRect;
    private Paint paintCirc;
    private Paint paintText;
    private Rect mRect;
    private int blue;
    private int purple;
    private int white;
    private int silver;

    public Gribouillage(Context context) {
        super(context);

        blue = getResources().getColor(R.color.blue);
        purple = getResources().getColor(R.color.purple_200);
        white = getResources().getColor(R.color.white);
        silver = getResources().getColor(R.color.silver);

        mRect = new Rect(30, 30, 320, 250);
        paintRect = new Paint();
        paintRect.setColor(blue);

        paintCirc = new Paint();
        paintCirc.setColor(purple);
        paintCirc.setStrokeWidth(5);
        paintCirc.setStyle(Paint.Style.STROKE);

        paintText = new Paint();
        paintText.setFakeBoldText(true);
        paintText.setTextSize(100);
        paintText.setColor(white);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(silver);
        canvas.drawRect(mRect, paintRect);
        canvas.drawCircle(400, 500, 150, paintCirc);
        canvas.drawText("Ceci est un texte", 300, 900, paintText);
    }
}

