package es.ulpgc.eite.da.letters_numbers.numbers;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.data.NumberData;


public class NumberListPresenter implements NumberListContract.Presenter {

  public static String TAG = "Letters-Numbers.NumberListPresenter";

  private WeakReference<NumberListContract.View> view;
  private NumberListState state;
  private NumberListContract.Model model;
  private AppMediator mediator;

  public NumberListPresenter(AppMediator mediator) {
    this.mediator = mediator;

  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart");

    state = new NumberListState();

    // TODO: add code if is necessary
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart");

    // TODO: add code if is necessary
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume");

    // TODO: add code if is necessary

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed");

    // TODO: add code if is necessary
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause");

    // TODO: add code if is necessary
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy");

    // TODO: add code if is necessary
  }


  @Override
  public void onClickNumberListButton() {
    Log.e(TAG, "onClickNumberListButton");

    // TODO: add code if is necessary
  }

  @Override
  public void onClickNumberListCell(NumberData data) {
    Log.e(TAG, "onClickNumberListCell");

    // TODO: add code if is necessary
  }


  @Override
  public void injectView(WeakReference<NumberListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(NumberListContract.Model model) {
    this.model = model;
  }

}
