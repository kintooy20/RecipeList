package com.example.gimenez1.recipelist

/**
 * Created by Gimenez1 on 12/8/2017.
 */


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainRecipe : AppCompatActivity() {


    private var mTvDesc: TextView? = null
    private var mTvName: TextView? = null
    private var mTvInd: TextView? = null
    private var mTvMethod: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recipe)

        supportActionBar?.title = "Recipes"
        supportActionBar?.setDisplayShowHomeEnabled(true)

        findViews()

        if(intent != null){
            val recipe = intent.getParcelableExtra<Recipe>(Key.RECIPE)

            mTvName?.text = recipe.name
            mTvDesc?.text = recipe.desc
            mTvInd?.text = recipe.inged
            mTvMethod?.text = recipe.method

        }


    }

    private fun findViews() {
        mTvDesc = findViewById<TextView>(R.id.txtDes)
        mTvName = findViewById<TextView>(R.id.txtName)
        mTvMethod = findViewById<TextView>(R.id.txtprod)
        mTvInd = findViewById<TextView>(R.id.txtind)
    }

}

