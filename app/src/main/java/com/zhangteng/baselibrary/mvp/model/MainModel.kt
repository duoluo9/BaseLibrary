package com.zhangteng.baselibrary.mvp.model

import com.zhangteng.base.mvp.base.BaseModel
import com.zhangteng.baselibrary.mvp.model.imodel.IMainModel

class MainModel : BaseModel(), IMainModel {
    override fun testString(): String? {
        return "test"
    }
}