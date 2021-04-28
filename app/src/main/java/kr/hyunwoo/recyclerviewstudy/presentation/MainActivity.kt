package kr.hyunwoo.recyclerviewstudy.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.hyunwoo.recyclerviewstudy.data.LocalRepositoryxDataSource
import kr.hyunwoo.recyclerviewstudy.data.RepositoryDataSource
import kr.hyunwoo.recyclerviewstudy.databinding.ActivityMainBinding
import kr.hyunwoo.recyclerviewstudy.presentation.model.GithubRepo

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var githubDataSource: RepositoryDataSource
    private val repoListAdapter by lazy { RepositoryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.rvMainList.adapter = repoListAdapter
        binding.rvMainList.addItemDecoration(VerticalItemDecoration(20))
        repoListAdapter.submitList(fetchData())
    }

    private fun fetchData(): List<GithubRepo> {
        githubDataSource = LocalRepositoryxDataSource()
        return githubDataSource.fetchRepoData()
    }
}