package uz.musofirlar.musofirlaruz.model

import uz.musofirlar.musofirlaruz.R

class SetViewPagerData  {
    private lateinit var listViewPagerData:ArrayList<ViewPagerData>

    companion object{
        val instance = SetViewPagerData()
    }

    fun getVPData() : ArrayList<ViewPagerData>{
         listViewPagerData = arrayListOf(
             ViewPagerData(R.drawable.screen1_image1,R.string.musofirlar_uz,R.string.intro1_description),
             ViewPagerData(R.drawable.intro2_head_img,R.string.musofirlar_uz_1,R.string.intro2_description),
             ViewPagerData(R.drawable.intro3_head_img,R.string.musofirlar_uz_1,R.string.intro3_description),
             ViewPagerData(R.drawable.intro4_head_img,R.string.musofirlar_uz_1,R.string.intro4_description)
         )

        return listViewPagerData
    }
}