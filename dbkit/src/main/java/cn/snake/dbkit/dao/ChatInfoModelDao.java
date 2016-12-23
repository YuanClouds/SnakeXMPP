package cn.snake.dbkit.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.snake.dbkit.bean.ChatInfoModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHAT_INFO_MODEL".
*/
public class ChatInfoModelDao extends AbstractDao<ChatInfoModel, Long> {

    public static final String TABLENAME = "CHAT_INFO_MODEL";

    /**
     * Properties of entity ChatInfoModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_id");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property GroupId = new Property(2, int.class, "groupId", false, "GROUP_ID");
        public final static Property Jid = new Property(3, String.class, "jid", false, "JID");
        public final static Property Type = new Property(4, String.class, "type", false, "TYPE");
        public final static Property IsFrom = new Property(5, String.class, "isFrom", false, "IS_FROM");
        public final static Property IsRead = new Property(6, int.class, "isRead", false, "IS_READ");
        public final static Property Message = new Property(7, String.class, "message", false, "MESSAGE");
        public final static Property State = new Property(8, String.class, "state", false, "STATE");
        public final static Property MessageStatus = new Property(9, String.class, "messageStatus", false, "MESSAGE_STATUS");
    }


    public ChatInfoModelDao(DaoConfig config) {
        super(config);
    }
    
    public ChatInfoModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_INFO_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _id
                "\"USER_ID\" TEXT," + // 1: userId
                "\"GROUP_ID\" INTEGER NOT NULL ," + // 2: groupId
                "\"JID\" TEXT," + // 3: jid
                "\"TYPE\" TEXT," + // 4: type
                "\"IS_FROM\" TEXT," + // 5: isFrom
                "\"IS_READ\" INTEGER NOT NULL ," + // 6: isRead
                "\"MESSAGE\" TEXT," + // 7: message
                "\"STATE\" TEXT," + // 8: state
                "\"MESSAGE_STATUS\" TEXT);"); // 9: messageStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_INFO_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ChatInfoModel entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
        stmt.bindLong(3, entity.getGroupId());
 
        String jid = entity.getJid();
        if (jid != null) {
            stmt.bindString(4, jid);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(5, type);
        }
 
        String isFrom = entity.getIsFrom();
        if (isFrom != null) {
            stmt.bindString(6, isFrom);
        }
        stmt.bindLong(7, entity.getIsRead());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(8, message);
        }
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(9, state);
        }
 
        String messageStatus = entity.getMessageStatus();
        if (messageStatus != null) {
            stmt.bindString(10, messageStatus);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ChatInfoModel entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
        stmt.bindLong(3, entity.getGroupId());
 
        String jid = entity.getJid();
        if (jid != null) {
            stmt.bindString(4, jid);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(5, type);
        }
 
        String isFrom = entity.getIsFrom();
        if (isFrom != null) {
            stmt.bindString(6, isFrom);
        }
        stmt.bindLong(7, entity.getIsRead());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(8, message);
        }
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(9, state);
        }
 
        String messageStatus = entity.getMessageStatus();
        if (messageStatus != null) {
            stmt.bindString(10, messageStatus);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ChatInfoModel readEntity(Cursor cursor, int offset) {
        ChatInfoModel entity = new ChatInfoModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userId
            cursor.getInt(offset + 2), // groupId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // jid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // type
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // isFrom
            cursor.getInt(offset + 6), // isRead
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // message
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // state
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // messageStatus
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ChatInfoModel entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGroupId(cursor.getInt(offset + 2));
        entity.setJid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsFrom(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsRead(cursor.getInt(offset + 6));
        entity.setMessage(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setState(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMessageStatus(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ChatInfoModel entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ChatInfoModel entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ChatInfoModel entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
