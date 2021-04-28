package kr.hyunwoo.recyclerviewstudy.data

import kr.hyunwoo.recyclerviewstudy.presentation.model.GithubRepo

class LocalRepositoryxDataSource : RepositoryDataSource {
    override fun fetchRepoData(): List<GithubRepo> {
        return listOf<GithubRepo>(
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "6"
            ),
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "5"
            ),
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "4"
            ),
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "3"
            ),
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "2"
            ),
            GithubRepo(
                name = "Android Sample",
                description = "Sample Project",
                starCount = "1"
            ),
        )
    }
}