package com.tdsoft.chatbotapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listitem_chat.view.*

class AdapterChatBot : RecyclerView.Adapter<AdapterChatBot.MyViewHolder>() {
    //private val list = ArrayList<ChatModel>()
    private val list = ArrayList<String>()

    inner class MyViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.listitem_chat, parent, false)
    ) {
        fun bind(chat:String) : Unit = with(itemView) {

            txtChat.text = chat
            /*if(!chat.isBot) {
                txtChat.setBackgroundColor(Color.WHITE)
                txtChat.setTextColor(Color.BLACK)
                txtChat.text = chat.chat
            }
            else
            {
                txtChat.setBackgroundColor(Color.CYAN)
                txtChat.setTextColor(Color.BLACK)
                txtChat.text = chat.chat
            }*/
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(parent)

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    fun addChatToList(chat: String) {
        list.add(chat)
        notifyDataSetChanged()
    }

}