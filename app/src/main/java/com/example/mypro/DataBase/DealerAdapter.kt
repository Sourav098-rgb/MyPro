package com.example.mypro.DataBase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.room.Delete
import androidx.navigation.Navigator
import androidx.recyclerview.widget.RecyclerView
import com.example.mypro.R

class DealerAdapter (val list:ArrayList<DealerDetails>):
        RecyclerView.Adapter<DealerAdapter.ViewHolder>(){
            class ViewHolder(
                var view: View):RecyclerView.ViewHolder(view){
                val name=view.findViewById<TextView>(R.id.Db_name)
                val contact=view.findViewById<TextView>(R.id.Db_contact)
                val milktype=view.findViewById<TextView>(R.id.Db_milktype)



            }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.dealerformat,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.apply {
           name.setText(list[position].Name)
           contact.setText(list[position].Contact.toString().toInt())
           milktype.setText(list[position].Milktype)

       }
    }

    override fun getItemCount(): Int {
  return list.size
    }
        }

