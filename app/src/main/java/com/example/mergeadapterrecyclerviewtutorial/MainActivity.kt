package com.example.mergeadapterrecyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import com.example.mergeadapterrecyclerviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var programmingLanguagesAdapter: ProgrammingLanguagesAdapter
    private lateinit var tipsAdapter: TipsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        programmingLanguagesAdapter = ProgrammingLanguagesAdapter()
        tipsAdapter = TipsAdapter()

        binding.recyclerFeed.adapter = ConcatAdapter(tipsAdapter, programmingLanguagesAdapter)

        programmingLanguagesAdapter.submitList(programmingLanguages)
        tipsAdapter.submitList(tips)
    }
}