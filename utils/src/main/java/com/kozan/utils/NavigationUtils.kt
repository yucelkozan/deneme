package com.kozan.utils

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavOptions

object NavigationUtils {

   private fun getRightAnimationsWithPopUpTo(@IdRes destinationId:Int, inclusive:Boolean=true): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.from_right)
            .setExitAnim(R.anim.to_left)
            .setPopEnterAnim(R.anim.from_left)
            .setPopExitAnim(R.anim.to_right)
            .setPopUpTo(destinationId,inclusive)
            .build()
    }

    private fun getRightAnimation(): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.from_right)
            .setExitAnim(R.anim.to_left)
            .setPopEnterAnim(R.anim.from_left)
            .setPopExitAnim(R.anim.to_right)
            .build()
    }

    fun getLeftAnimationsWithPopUpTo(@IdRes destinationId:Int, inclusive:Boolean=true): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.from_left)
            .setExitAnim(R.anim.to_right)
            .setPopEnterAnim(R.anim.from_right)
            .setPopExitAnim(R.anim.to_left)
            .setPopUpTo(destinationId,inclusive)
            .build()
    }

 /*   fun getDefaultAnimationsWithPopUpTo(@IdRes destinationId:Int, inclusive:Boolean=true): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.nav_default_enter_anim)
            .setExitAnim(R.anim.nav_default_exit_anim)
            .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
            .setPopUpTo(destinationId,inclusive)
            .build()
    }*/

    fun goToNextWithRightAnimAndPopUpto(navController: NavController, @IdRes currentDestinationId:Int, @IdRes nextDestinationId:Int, ){
        navController.navigate(nextDestinationId,null,
            getRightAnimationsWithPopUpTo(currentDestinationId)
        )
    }

    fun goToNextWithRightAnim(navController: NavController,  @IdRes nextDestinationId:Int, ){
        navController.navigate(nextDestinationId,null, getRightAnimation())
    }



}