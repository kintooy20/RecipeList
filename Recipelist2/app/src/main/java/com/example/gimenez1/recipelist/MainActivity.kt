package com.larosa.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import android.widget.LinearLayout
import com.example.gimenez1.recipelist.R
import com.example.gimenez1.recipelist.Recipe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findView()

        mRecyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val Addrecipe = ArrayList<Recipe>()

        Addrecipe.add(Recipe("Adobo",

                "Tasty Filipino Dish\n" +

                "Ingredients:\n" +
                        "2 lbs pork belly\n\n" +
                        "2 tbsp garlic, minced or crushed\n\n" +
                        "5 pieces dried bay leaves\n" +
                        "4 tbsp vinegar\n" +
                        "½ cup soy sauce\n" +
                        "1 tbsp whole peppercorn\n" +
                        "\n" +
                        "1 to 2 cups water\n" +
                        "\n" +
                        "Salt to taste",
                "Procedure :\n" +
                        "Combine the pork belly, soy sauce, and garlic then marinade for at least 1 hour\n" +
                        "Heat the pot and put-in the marinated pork belly then cook for a few minutes\n" +
                        "Add water, whole pepper corn, and dried bay leaves then bring to a boil. Simmer for 40 minutes to 1 hour\n" +
                        "Put-in the vinegar and simmer for 12 to 15 minutes\n" +
                        "Add salt to taste\n" +
                        "Serve hot. Share and enjoy!"))

        Addrecipe.add(Recipe("Fried Chicken",

                "Quick and easy delicious food\n",
                "Ingredients: \n" +
                        "4 cups all-purpose flour, divided\n" +
                        "2 tablespoons garlic salt\n" +
                        "1 tablespoon paprika\n" +
                        "3 teaspoons pepper, divided\n" +
                        "2-1/2 teaspoons poultry seasoning\n" +
                        "2 large eggs\n" +
                        "1-1/2 cups water\n" +
                        "1 teaspoon salt\n" +
                        "2 broiler/fryer chickens (3-1/2 to 4 pounds each), cut up\n" +
                        "Oil for deep-fat frying\n" +
                        "1 egg\n"
                        ,

                "Procedure:\n " +
                        "In a large resealable plastic bag, combine 2-2/3 cups flour, garlic salt, paprika, 2-1/2 teaspoons pepper and poultry seasoning. In a shallow bowl, beat eggs and water; add salt and the remaining flour and pepper. Dip chicken in egg mixture, then place in the bag, a few pieces at a time. Seal bag and shake to coat.\n" +
                        "In a deep-fat fryer, heat oil to 375°. Fry chicken, several pieces at a time, for 5-6 minutes on each side or until golden brown and juices run clear. Drain on paper towels. Yield: 8 servings.\n" +
                        ))

        Addrecipe.add(Recipe("Lumpia",

                "Quick and easy meal that is commonly ate by most Filipinos",


                "Ingredients: \n  " +
                        "    1 pound ground pork\n" +
                        "1 small carrot, minced\n" +
                        "1 medium sweet onion (yellow), minced\n" +
                        "1 teaspoon garlic powder\n" +
                        "⅛ teaspoon ground black pepper\n" +
                        "1 teaspoon salt\n" +
                        "1 piece egg\n" +
                        "20 to 25 pieces medium lumpia wrapper\n" +
                        "1 ½ cups cooking oil"
                        ,
                "Procedures: \n " +
                        "        Combine ground pork, salt, pepper, garlic powder, minced onion, cracked egg, and minced carrot in a bowl. Mix \n" +
                        "well using your hands. Make sure to wash before doing this step, or wear gloves that are latex free and BPA free.\n" +
                        "Lay a piece of lumpia wrapper flat on a plate. Adjust the orientation of the wrapper by rotating the plate so that one side points upward while the rest of the sides are pointing down, left, and right -- just like a diamond. Scoop 1 ½ to 2 tablespoons of meat mixture and place it at one the left side of the wrapper. Shape the meat unto a cylinder. Fold the pointed side of the wrapper towards the pork mixture and then roll inwards by 1 to 2 inches. Fold the top and bottom ends inwardand then continue to roll the wrapper until the mixture is completely wrapped. Seal by rubbing water using your fingers on the right end of the wrapper and press it gently against the rolled lumpia. Perform this step with the remaining ingredients.\n" +
                        "Heat the oil in a small pot.\n" +
                        "Deep fry the lumpia in batches of 4 to 6 pieces in medium heat for 10 minutes or until the wrapper turns light to golden brown.\n" +
                        "Remove the fried lumpia from the pot. Let the oil drip.\n" +
                        "Serve with banana ketchup or sweet and sour sauce.\n" +
                        "Share and enjoy! "))

        Addrecipe.add(Recipe("Pork Sinigang",

                "A very traditional soup by most Filipinos; consumed especially in cold weather.",
                "Ingredients: \n " +
                        " 2 lbs pork liempo; cut 2 inches chunks\n" +
                        "1 package tamarind sinigang soup mix\n" +
                        "1 tomato; quartered\n" +
                        "1 onion; quartered\n" +
                        "1 taro; quartered\n" +
                        "3-4 long green chili peppers (siling haba)\n" +
                        "1 medium size radish (labanos); sliced\n" +
                        "3 string beans (sitaw), cut in 2 inches long\n" +
                        "1 eggplant; sliced\n" +
                        "10 stems of kangkong leaves\n" +
                        "Fish sauce to taste\n" +
                        "Water\n"
                       ,
                "Procedure :\n" +
                        "Boil water in a pot.\n" +
                        "Add the pork liempo, tomato, onion, and tamarind sinigang soup mix.\n" +
                        "Cover the pot and boil until the meat is tender.\n" +
                        "Add the long chili pepper, radish, taro, string beans, and eggplant.\n" +
                        "Cover the pot and continue boiling until the vegetables are cooked.\n" +
                        "Add the kangkong leaves and simmer until the dish is done.\n" +
                        "Serve while hot!"))




        val adapter = Adapter(Addrecipe)

        mRecyclerView!!.adapter = adapter

        mRecyclerView!!.addItemDecoration(DividerItemDecoration(recyclerView1.getContext(), LinearLayoutManager.VERTICAL))
    }

    private fun findView() {
        mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView1) as RecyclerView
    }
}
