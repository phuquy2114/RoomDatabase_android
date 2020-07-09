package com.uits.roomdatabase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uits.baseproject.base.BaseAdapter
import com.uits.roomdatabase.database.entities.Contact

/**
 * Main Adapter
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/6/20.
 **/

class MainAdapter(val mContext: Context) : BaseAdapter<RecyclerView.ViewHolder>(mContext) {

    private var mContacts = emptyList<Contact>() // Cached copy of words

    internal fun setData(mContacts: List<Contact>) {
        this.mContacts = mContacts
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewholder_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mContacts.size
    }

    internal class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}
