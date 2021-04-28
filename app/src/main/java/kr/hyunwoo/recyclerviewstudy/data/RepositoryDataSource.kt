package kr.hyunwoo.recyclerviewstudy.data

import kr.hyunwoo.recyclerviewstudy.presentation.model.GithubRepo

interface RepositoryDataSource {
    fun fetchRepoData(): List<GithubRepo>
}