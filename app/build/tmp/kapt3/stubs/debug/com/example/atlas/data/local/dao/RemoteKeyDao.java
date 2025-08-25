package com.example.atlas.data.local.dao;

import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.atlas.data.local.entity.CharacterEntity;
import com.example.atlas.data.local.entity.RemoteKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/atlas/data/local/dao/RemoteKeyDao;", "", "clearRemoteKeys", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "keys", "", "Lcom/example/atlas/data/local/entity/RemoteKey;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remoteKeyById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface RemoteKeyDao {
    
    @androidx.room.Query(value = "SELECT * FROM remote_keys WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object remoteKeyById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.atlas.data.local.entity.RemoteKey> $completion);
    
    @androidx.room.Query(value = "DELETE FROM remote_keys")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearRemoteKeys(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.atlas.data.local.entity.RemoteKey> keys, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}