package com.example.julia.lw_9v2;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);

    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        Date date = new Date();
        SimpleDateFormat dayFormat= new SimpleDateFormat("EEEE", Locale.getDefault());
        String day = dayFormat.format(date);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
        views.setTextViewText(R.id.tv, "Сегодня \n"+day);
        appWidgetManager.updateAppWidget(appWidgetIds, views);
// здесь ваш текст
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
// здесь ваш текст
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
// здесь ваш текст
    }
}