package cn.tongchengyuan.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import cn.tongchengyuan.bean.DynamicBean;
import cn.tongchengyuan.bean.FriendBean;
import cn.tongchengyuan.bean.UserBasicInfo;
import cn.tongchengyuan.bean.UserBean;
import cn.tongchengyuan.bean.UserExtendInfo;
import cn.tongchengyuan.chat.bean.MessageBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dynamicBeanDaoConfig;
    private final DaoConfig friendBeanDaoConfig;
    private final DaoConfig userBasicInfoDaoConfig;
    private final DaoConfig userBeanDaoConfig;
    private final DaoConfig userExtendInfoDaoConfig;
    private final DaoConfig messageBeanDaoConfig;

    private final DynamicBeanDao dynamicBeanDao;
    private final FriendBeanDao friendBeanDao;
    private final UserBasicInfoDao userBasicInfoDao;
    private final UserBeanDao userBeanDao;
    private final UserExtendInfoDao userExtendInfoDao;
    private final MessageBeanDao messageBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dynamicBeanDaoConfig = daoConfigMap.get(DynamicBeanDao.class).clone();
        dynamicBeanDaoConfig.initIdentityScope(type);

        friendBeanDaoConfig = daoConfigMap.get(FriendBeanDao.class).clone();
        friendBeanDaoConfig.initIdentityScope(type);

        userBasicInfoDaoConfig = daoConfigMap.get(UserBasicInfoDao.class).clone();
        userBasicInfoDaoConfig.initIdentityScope(type);

        userBeanDaoConfig = daoConfigMap.get(UserBeanDao.class).clone();
        userBeanDaoConfig.initIdentityScope(type);

        userExtendInfoDaoConfig = daoConfigMap.get(UserExtendInfoDao.class).clone();
        userExtendInfoDaoConfig.initIdentityScope(type);

        messageBeanDaoConfig = daoConfigMap.get(MessageBeanDao.class).clone();
        messageBeanDaoConfig.initIdentityScope(type);

        dynamicBeanDao = new DynamicBeanDao(dynamicBeanDaoConfig, this);
        friendBeanDao = new FriendBeanDao(friendBeanDaoConfig, this);
        userBasicInfoDao = new UserBasicInfoDao(userBasicInfoDaoConfig, this);
        userBeanDao = new UserBeanDao(userBeanDaoConfig, this);
        userExtendInfoDao = new UserExtendInfoDao(userExtendInfoDaoConfig, this);
        messageBeanDao = new MessageBeanDao(messageBeanDaoConfig, this);

        registerDao(DynamicBean.class, dynamicBeanDao);
        registerDao(FriendBean.class, friendBeanDao);
        registerDao(UserBasicInfo.class, userBasicInfoDao);
        registerDao(UserBean.class, userBeanDao);
        registerDao(UserExtendInfo.class, userExtendInfoDao);
        registerDao(MessageBean.class, messageBeanDao);
    }
    
    public void clear() {
        dynamicBeanDaoConfig.clearIdentityScope();
        friendBeanDaoConfig.clearIdentityScope();
        userBasicInfoDaoConfig.clearIdentityScope();
        userBeanDaoConfig.clearIdentityScope();
        userExtendInfoDaoConfig.clearIdentityScope();
        messageBeanDaoConfig.clearIdentityScope();
    }

    public DynamicBeanDao getDynamicBeanDao() {
        return dynamicBeanDao;
    }

    public FriendBeanDao getFriendBeanDao() {
        return friendBeanDao;
    }

    public UserBasicInfoDao getUserBasicInfoDao() {
        return userBasicInfoDao;
    }

    public UserBeanDao getUserBeanDao() {
        return userBeanDao;
    }

    public UserExtendInfoDao getUserExtendInfoDao() {
        return userExtendInfoDao;
    }

    public MessageBeanDao getMessageBeanDao() {
        return messageBeanDao;
    }

}
