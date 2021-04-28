package kr.hyunwoo.recyclerviewstudy.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.hyunwoo.recyclerviewstudy.databinding.ItemMainListBinding
import kr.hyunwoo.recyclerviewstudy.presentation.model.GithubRepo

class RepositoryAdapter :
    ListAdapter<GithubRepo, RepositoryAdapter.RepositoryViewHolder>(RepoDiffUtil) {
    class RepositoryViewHolder(private val binding: ItemMainListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(githubRepo: GithubRepo) {
            binding.githubRepo = githubRepo
        }
    }


    object RepoDiffUtil : DiffUtil.ItemCallback<GithubRepo>() {
        override fun areItemsTheSame(oldItem: GithubRepo, newItem: GithubRepo): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: GithubRepo, newItem: GithubRepo): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMainListBinding.inflate(layoutInflater, parent, false)
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}