package com.juns.wechat.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.juns.wechat.bean.DynamicBean;
import com.juns.wechat.bean.UserBasicInfo;
import com.juns.wechat.bean.UserExtendInfo;

import com.juns.wechat.greendao.dao.DynamicBeanDao;
import com.juns.wechat.greendao.dao.UserBasicInfoDao;
import com.juns.wechat.greendao.dao.UserExtendInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dynamicBeanDaoConfig;
    private final DaoConfig userBasicInfoDaoConfig;
    private final DaoConfig userExtendInfoDaoConfig;

    private final DynamicBeanDao dynamicBeanDao;
    private final UserBasicInfoDao userBasicInfoDao;
    private final UserExtendInfoDao userExtendInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dynamicBeanDaoConfig = daoConfigMap.get(DynamicBeanDao.class).clone();
        dynamicBeanDaoConfig.initIdentityScope(type);

        userBasicInfoDaoConfig = daoConfigMap.get(UserBasicInfoDao.class).clone();
        userBasicInfoDaoConfig.initIdentityScope(type);

        userExtendInfoDaoConfig = daoConfigMap.get(UserExtendInfoDao.class).clone();
        userExtendInfoDaoConfig.initIdentityScope(type);

        dynamicBeanDao = new DynamicBeanDao(dynamicBeanDaoConfig, this);
        userBasicInfoDao = new UserBasicInfoDao(userBasicInfoDaoConfig, this);
        userExtendInfoDao = new UserExtendInfoDao(userExtendInfoDaoConfig, this);

        registerDao(DynamicBean.class, dynamicBeanDao);
        registerDao(UserBasicInfo.class, userBasicInfoDao);
        registerDao(UserExtendInfo.class, userExtendInfoDao);
    }
    
    public void clear() {
        dynamicBeanDaoConfig.clearIdentityScope();
        userBasicInfoDaoConfig.clearIdentityScope();
        userExtendInfoDaoConfig.clearIdentityScope();
    }

    public DynamicBeanDao getDynamicBeanDao() {
        return dynamicBeanDao;
    }

    public UserBasicInfoDao getUserBasicInfoDao() {
        return userBasicInfoDao;
    }

    public UserExtendInfoDao getUserExtendInfoDao() {
        return userExtendInfoDao;
    }

}
