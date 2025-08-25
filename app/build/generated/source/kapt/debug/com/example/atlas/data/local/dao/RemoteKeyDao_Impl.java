package com.example.atlas.data.local.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.atlas.data.local.entity.RemoteKey;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class RemoteKeyDao_Impl implements RemoteKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<RemoteKey> __insertAdapterOfRemoteKey;

  public RemoteKeyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfRemoteKey = new EntityInsertAdapter<RemoteKey>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `remote_keys` (`id`,`prevKey`,`nextKey`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final RemoteKey entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getPrevKey() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getPrevKey());
        }
        if (entity.getNextKey() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getNextKey());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<RemoteKey> keys, final Continuation<? super Unit> arg1) {
    if (keys == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfRemoteKey.insert(_connection, keys);
      return Unit.INSTANCE;
    }, arg1);
  }

  @Override
  public Object remoteKeyById(final int id, final Continuation<? super RemoteKey> arg1) {
    final String _sql = "SELECT * FROM remote_keys WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfPrevKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "prevKey");
        final int _cursorIndexOfNextKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nextKey");
        final RemoteKey _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final Integer _tmpPrevKey;
          if (_stmt.isNull(_cursorIndexOfPrevKey)) {
            _tmpPrevKey = null;
          } else {
            _tmpPrevKey = (int) (_stmt.getLong(_cursorIndexOfPrevKey));
          }
          final Integer _tmpNextKey;
          if (_stmt.isNull(_cursorIndexOfNextKey)) {
            _tmpNextKey = null;
          } else {
            _tmpNextKey = (int) (_stmt.getLong(_cursorIndexOfNextKey));
          }
          _result = new RemoteKey(_tmpId,_tmpPrevKey,_tmpNextKey);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, arg1);
  }

  @Override
  public Object clearRemoteKeys(final Continuation<? super Unit> arg0) {
    final String _sql = "DELETE FROM remote_keys";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg0);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
