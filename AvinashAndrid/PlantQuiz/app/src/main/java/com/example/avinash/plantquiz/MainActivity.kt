package com.example.avinash.plantquiz

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.AsyncTask
import android.os.Bundle
import android.provider.MediaStore
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private  var cameraButton : Button? = null
    private  var photoGalleryButton : Button? = null
    private  var imageTaken : ImageView? = null

    val OPEN_CAMERA_BUTTON_REQUEST_ID = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show()

       // val myPlant: Plant = Plant( genuys = "" , species = "" , cultivar = ""
         //   , common = "", pictureName = "" , description = "" , difficulty = 0 , id  = 0)


       /* var flower = Plant()
        var tree = Plant()

        var collectionOfPlants : ArrayList<Plant> = ArrayList()
        collectionOfPlants.add(flower)
        collectionOfPlants.add(tree)*/

        cameraButton = findViewById<Button>(R.id.btnOpenCamera)
        photoGalleryButton = findViewById<Button>(R.id.btnOpenGallery)

        imageTaken = findViewById<ImageView>(R.id.imgTaken)

        cameraButton?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Camera Button is Clicked", Toast.LENGTH_SHORT).show()

        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, OPEN_CAMERA_BUTTON_REQUEST_ID)

        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == OPEN_CAMERA_BUTTON_REQUEST_ID) {

            if (resultCode == Activity.RESULT_OK) {
                val  imageData = data?.getExtras()?.get("data") as Bitmap
                imageTaken?.setImageBitmap(imageData)
            }

        }

    }


    fun button1isClicked(buttonView : View) {
        Toast.makeText(this@MainActivity, "Button 1 is cliked", Toast.LENGTH_SHORT).show()

        var myNumber = 20 //Implied Data Type
        val myName : String = "Avinash"
        var numberOfLetters = myName.length

        var animalName : String? = null
        var numberOfCharactersOfAnimalName = animalName?.length

    }

    fun button2isClicked(buttonView : View) {
        Toast.makeText(this@MainActivity, "Button 2 is cliked", Toast.LENGTH_SHORT).show()
    }

    fun button3isClicked(buttonView : View) {
        Toast.makeText(this@MainActivity, "Button 3 is cliked", Toast.LENGTH_SHORT).show()
    }

    fun button4isClicked(buttonView : View) {
        Toast.makeText(this@MainActivity, "Button 4 is cliked", Toast.LENGTH_SHORT).show()
    }


    inner class DownloadinPlantTask : AsyncTask<String , Int , List<Plant>>() {

        override fun doInBackground(vararg params: String?): List<Plant>? {

            return null
        }

        override fun onPostExecute(result: List<Plant>?) {
            super.onPostExecute(result)

        }

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this@MainActivity, "Its On Start", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this@MainActivity, "Its On Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this@MainActivity, "Its On Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this@MainActivity, "Its On Stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this@MainActivity, "Its On Distroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this@MainActivity, "Its On Restart", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
