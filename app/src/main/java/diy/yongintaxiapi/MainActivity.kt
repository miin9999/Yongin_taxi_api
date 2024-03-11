package diy.yongintaxiapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import diy.Repository
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        scope.launch{

            try{

                val dataSetofTaxi = Repository.getTaxiInfo(2023,1)
                Log.d("dfadsfsafasdf",dataSetofTaxi)



            }catch (E : Exception){

            }finally {

            }
        }


    }
}