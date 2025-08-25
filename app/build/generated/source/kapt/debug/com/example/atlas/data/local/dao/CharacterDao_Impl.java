package com.example.atlas.data.local.dao;

import androidx.annotation.NonNull;
import androidx.paging.PagingSource;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.atlas.data.local.entity.CharacterEntity;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class CharacterDao_Impl implements CharacterDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<CharacterEntity> __insertAdapterOfCharacterEntity;

  public CharacterDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfCharacterEntity = new EntityInsertAdapter<CharacterEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `characters` (`id`,`name`,`status`,`species`,`image`,`gender`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final CharacterEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getName());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getStatus());
        }
        if (entity.getSpecies() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getSpecies());
        }
        if (entity.getImage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getImage());
        }
        if (entity.getGender() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getGender());
        }
      }
    };
  }

  @Override
  public Object upsertAll(final List<CharacterEntity> items,
      final Continuation<? super Unit> $completion) {
    if (items == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfCharacterEntity.insert(_connection, items);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public PagingSource<Integer, CharacterEntity> pagingSource(final String q) {
    final String _sql = "SELECT * FROM characters WHERE name LIKE '%' || ? || '%' ORDER BY id ASC";
    final RoomRawQuery _rawQuery = new RoomRawQuery(_sql, new Function1<SQLiteStatement, Unit>() {
      @Override
      @NonNull
      public Unit invoke(@NonNull final SQLiteStatement _stmt) {
        int _argIndex = 1;
        if (q == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, q);
        }
        return Unit.INSTANCE;
      }
    });
    return new LimitOffsetPagingSource<CharacterEntity>(_rawQuery, __db, "characters") {
      @Override
      protected Object convertRows(final RoomRawQuery limitOffsetQuery, final int itemCount,
          final Continuation<? super List<? extends CharacterEntity>> $completion) {
        return DBUtil.performSuspending(__db, true, false, (_connection) -> {
          final SQLiteStatement _stmt = _connection.prepare(limitOffsetQuery.getSql());
          limitOffsetQuery.getBindingFunction().invoke(_stmt);
          try {
            final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            final int _cursorIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
            final int _cursorIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
            final int _cursorIndexOfSpecies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "species");
            final int _cursorIndexOfImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "image");
            final int _cursorIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
            final List<CharacterEntity> _result = new ArrayList<CharacterEntity>();
            while (_stmt.step()) {
              final CharacterEntity _item;
              final int _tmpId;
              _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
              final String _tmpName;
              if (_stmt.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _stmt.getText(_cursorIndexOfName);
              }
              final String _tmpStatus;
              if (_stmt.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _stmt.getText(_cursorIndexOfStatus);
              }
              final String _tmpSpecies;
              if (_stmt.isNull(_cursorIndexOfSpecies)) {
                _tmpSpecies = null;
              } else {
                _tmpSpecies = _stmt.getText(_cursorIndexOfSpecies);
              }
              final String _tmpImage;
              if (_stmt.isNull(_cursorIndexOfImage)) {
                _tmpImage = null;
              } else {
                _tmpImage = _stmt.getText(_cursorIndexOfImage);
              }
              final String _tmpGender;
              if (_stmt.isNull(_cursorIndexOfGender)) {
                _tmpGender = null;
              } else {
                _tmpGender = _stmt.getText(_cursorIndexOfGender);
              }
              _item = new CharacterEntity(_tmpId,_tmpName,_tmpStatus,_tmpSpecies,_tmpImage,_tmpGender);
              _result.add(_item);
            }
            return _result;
          } finally {
            _stmt.close();
          }
        }, $completion);
      }
    };
  }

  @Override
  public Object getCharacterById(final int id,
      final Continuation<? super CharacterEntity> $completion) {
    final String _sql = "SELECT * FROM characters WHERE id = ? LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _cursorIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
        final int _cursorIndexOfSpecies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "species");
        final int _cursorIndexOfImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "image");
        final int _cursorIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final CharacterEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpName;
          if (_stmt.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_cursorIndexOfName);
          }
          final String _tmpStatus;
          if (_stmt.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _stmt.getText(_cursorIndexOfStatus);
          }
          final String _tmpSpecies;
          if (_stmt.isNull(_cursorIndexOfSpecies)) {
            _tmpSpecies = null;
          } else {
            _tmpSpecies = _stmt.getText(_cursorIndexOfSpecies);
          }
          final String _tmpImage;
          if (_stmt.isNull(_cursorIndexOfImage)) {
            _tmpImage = null;
          } else {
            _tmpImage = _stmt.getText(_cursorIndexOfImage);
          }
          final String _tmpGender;
          if (_stmt.isNull(_cursorIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_cursorIndexOfGender);
          }
          _result = new CharacterEntity(_tmpId,_tmpName,_tmpStatus,_tmpSpecies,_tmpImage,_tmpGender);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM characters";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
