package com.priyanka.digitaldiary.helper;

public interface ItemTouchSwipeListener {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}
