package com.priyanka.digitaldiary.helper;

import com.priyanka.digitaldiary.DDAdapter;

public interface ItemTouchHelperContract {
    void onRowMoved(int fromPosition, int toPosition);
    void onRowSelected(DDAdapter.MyViewHolder myViewHolder);
    void onRowClear(DDAdapter.MyViewHolder myViewHolder);

}
