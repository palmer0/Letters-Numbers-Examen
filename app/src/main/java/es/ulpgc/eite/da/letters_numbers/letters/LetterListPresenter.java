package es.ulpgc.eite.da.letters_numbers.letters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.data.LetterData;


public class LetterListPresenter implements LetterListContract.Presenter {

  public static String TAG = "Letters-Numbers.LetterListPresenter";

  private WeakReference<LetterListContract.View> view;
  private LetterListState state;
  private LetterListContract.Model model;
  private AppMediator mediator;

  public LetterListPresenter(AppMediator mediator) {
    this.mediator = mediator;

  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart");

    state = new LetterListState();

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
  public void onClickLetterListButton() {
    Log.e(TAG, "onClickLetterListButton");

    // TODO: add code if is necessary
  }

  @Override
  public void onClickLetterListCell(LetterData data) {
    Log.e(TAG, "onClickLetterListCell");

    // TODO: add code if is necessary
  }


  @Override
  public void injectView(WeakReference<LetterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(LetterListContract.Model model) {
    this.model = model;
  }

}
