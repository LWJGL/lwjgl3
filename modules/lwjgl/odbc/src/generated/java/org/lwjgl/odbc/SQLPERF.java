/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SQLPERF {
 *     DWORD TimerResolution;
 *     DWORD SQLidu;
 *     DWORD SQLiduRows;
 *     DWORD SQLSelects;
 *     DWORD SQLSelectRows;
 *     DWORD Transactions;
 *     DWORD SQLPrepares;
 *     DWORD ExecDirects;
 *     DWORD SQLExecutes;
 *     DWORD CursorOpens;
 *     DWORD CursorSize;
 *     DWORD CursorUsed;
 *     LDOUBLE PercentCursorUsed;
 *     LDOUBLE AvgFetchTime;
 *     LDOUBLE AvgCursorSize;
 *     LDOUBLE AvgCursorUsed;
 *     DWORD SQLFetchTime;
 *     DWORD SQLFetchCount;
 *     DWORD CurrentStmtCount;
 *     DWORD MaxOpenStmt;
 *     DWORD SumOpenStmt;
 *     DWORD CurrentConnectionCount;
 *     DWORD MaxConnectionsOpened;
 *     DWORD SumConnectionsOpened;
 *     DWORD SumConnectiontime;
 *     LDOUBLE AvgTimeOpened;
 *     DWORD ServerRndTrips;
 *     DWORD BuffersSent;
 *     DWORD BuffersRec;
 *     DWORD BytesSent;
 *     DWORD BytesRec;
 *     DWORD msExecutionTime;
 *     DWORD msNetWorkServerTime;
 * }</code></pre>
 */
public class SQLPERF extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TIMERRESOLUTION,
        SQLIDU,
        SQLIDUROWS,
        SQLSELECTS,
        SQLSELECTROWS,
        TRANSACTIONS,
        SQLPREPARES,
        EXECDIRECTS,
        SQLEXECUTES,
        CURSOROPENS,
        CURSORSIZE,
        CURSORUSED,
        PERCENTCURSORUSED,
        AVGFETCHTIME,
        AVGCURSORSIZE,
        AVGCURSORUSED,
        SQLFETCHTIME,
        SQLFETCHCOUNT,
        CURRENTSTMTCOUNT,
        MAXOPENSTMT,
        SUMOPENSTMT,
        CURRENTCONNECTIONCOUNT,
        MAXCONNECTIONSOPENED,
        SUMCONNECTIONSOPENED,
        SUMCONNECTIONTIME,
        AVGTIMEOPENED,
        SERVERRNDTRIPS,
        BUFFERSSENT,
        BUFFERSREC,
        BYTESSENT,
        BYTESREC,
        MSEXECUTIONTIME,
        MSNETWORKSERVERTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TIMERRESOLUTION = layout.offsetof(0);
        SQLIDU = layout.offsetof(1);
        SQLIDUROWS = layout.offsetof(2);
        SQLSELECTS = layout.offsetof(3);
        SQLSELECTROWS = layout.offsetof(4);
        TRANSACTIONS = layout.offsetof(5);
        SQLPREPARES = layout.offsetof(6);
        EXECDIRECTS = layout.offsetof(7);
        SQLEXECUTES = layout.offsetof(8);
        CURSOROPENS = layout.offsetof(9);
        CURSORSIZE = layout.offsetof(10);
        CURSORUSED = layout.offsetof(11);
        PERCENTCURSORUSED = layout.offsetof(12);
        AVGFETCHTIME = layout.offsetof(13);
        AVGCURSORSIZE = layout.offsetof(14);
        AVGCURSORUSED = layout.offsetof(15);
        SQLFETCHTIME = layout.offsetof(16);
        SQLFETCHCOUNT = layout.offsetof(17);
        CURRENTSTMTCOUNT = layout.offsetof(18);
        MAXOPENSTMT = layout.offsetof(19);
        SUMOPENSTMT = layout.offsetof(20);
        CURRENTCONNECTIONCOUNT = layout.offsetof(21);
        MAXCONNECTIONSOPENED = layout.offsetof(22);
        SUMCONNECTIONSOPENED = layout.offsetof(23);
        SUMCONNECTIONTIME = layout.offsetof(24);
        AVGTIMEOPENED = layout.offsetof(25);
        SERVERRNDTRIPS = layout.offsetof(26);
        BUFFERSSENT = layout.offsetof(27);
        BUFFERSREC = layout.offsetof(28);
        BYTESSENT = layout.offsetof(29);
        BYTESREC = layout.offsetof(30);
        MSEXECUTIONTIME = layout.offsetof(31);
        MSNETWORKSERVERTIME = layout.offsetof(32);
    }

    /**
     * Creates a {@code SQLPERF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQLPERF(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code TimerResolution} field. */
    @NativeType("DWORD")
    public int TimerResolution() { return nTimerResolution(address()); }
    /** @return the value of the {@code SQLidu} field. */
    @NativeType("DWORD")
    public int SQLidu() { return nSQLidu(address()); }
    /** @return the value of the {@code SQLiduRows} field. */
    @NativeType("DWORD")
    public int SQLiduRows() { return nSQLiduRows(address()); }
    /** @return the value of the {@code SQLSelects} field. */
    @NativeType("DWORD")
    public int SQLSelects() { return nSQLSelects(address()); }
    /** @return the value of the {@code SQLSelectRows} field. */
    @NativeType("DWORD")
    public int SQLSelectRows() { return nSQLSelectRows(address()); }
    /** @return the value of the {@code Transactions} field. */
    @NativeType("DWORD")
    public int Transactions() { return nTransactions(address()); }
    /** @return the value of the {@code SQLPrepares} field. */
    @NativeType("DWORD")
    public int SQLPrepares() { return nSQLPrepares(address()); }
    /** @return the value of the {@code ExecDirects} field. */
    @NativeType("DWORD")
    public int ExecDirects() { return nExecDirects(address()); }
    /** @return the value of the {@code SQLExecutes} field. */
    @NativeType("DWORD")
    public int SQLExecutes() { return nSQLExecutes(address()); }
    /** @return the value of the {@code CursorOpens} field. */
    @NativeType("DWORD")
    public int CursorOpens() { return nCursorOpens(address()); }
    /** @return the value of the {@code CursorSize} field. */
    @NativeType("DWORD")
    public int CursorSize() { return nCursorSize(address()); }
    /** @return the value of the {@code CursorUsed} field. */
    @NativeType("DWORD")
    public int CursorUsed() { return nCursorUsed(address()); }
    /** @return the value of the {@code PercentCursorUsed} field. */
    @NativeType("LDOUBLE")
    public double PercentCursorUsed() { return nPercentCursorUsed(address()); }
    /** @return the value of the {@code AvgFetchTime} field. */
    @NativeType("LDOUBLE")
    public double AvgFetchTime() { return nAvgFetchTime(address()); }
    /** @return the value of the {@code AvgCursorSize} field. */
    @NativeType("LDOUBLE")
    public double AvgCursorSize() { return nAvgCursorSize(address()); }
    /** @return the value of the {@code AvgCursorUsed} field. */
    @NativeType("LDOUBLE")
    public double AvgCursorUsed() { return nAvgCursorUsed(address()); }
    /** @return the value of the {@code SQLFetchTime} field. */
    @NativeType("DWORD")
    public int SQLFetchTime() { return nSQLFetchTime(address()); }
    /** @return the value of the {@code SQLFetchCount} field. */
    @NativeType("DWORD")
    public int SQLFetchCount() { return nSQLFetchCount(address()); }
    /** @return the value of the {@code CurrentStmtCount} field. */
    @NativeType("DWORD")
    public int CurrentStmtCount() { return nCurrentStmtCount(address()); }
    /** @return the value of the {@code MaxOpenStmt} field. */
    @NativeType("DWORD")
    public int MaxOpenStmt() { return nMaxOpenStmt(address()); }
    /** @return the value of the {@code SumOpenStmt} field. */
    @NativeType("DWORD")
    public int SumOpenStmt() { return nSumOpenStmt(address()); }
    /** @return the value of the {@code CurrentConnectionCount} field. */
    @NativeType("DWORD")
    public int CurrentConnectionCount() { return nCurrentConnectionCount(address()); }
    /** @return the value of the {@code MaxConnectionsOpened} field. */
    @NativeType("DWORD")
    public int MaxConnectionsOpened() { return nMaxConnectionsOpened(address()); }
    /** @return the value of the {@code SumConnectionsOpened} field. */
    @NativeType("DWORD")
    public int SumConnectionsOpened() { return nSumConnectionsOpened(address()); }
    /** @return the value of the {@code SumConnectiontime} field. */
    @NativeType("DWORD")
    public int SumConnectiontime() { return nSumConnectiontime(address()); }
    /** @return the value of the {@code AvgTimeOpened} field. */
    @NativeType("LDOUBLE")
    public double AvgTimeOpened() { return nAvgTimeOpened(address()); }
    /** @return the value of the {@code ServerRndTrips} field. */
    @NativeType("DWORD")
    public int ServerRndTrips() { return nServerRndTrips(address()); }
    /** @return the value of the {@code BuffersSent} field. */
    @NativeType("DWORD")
    public int BuffersSent() { return nBuffersSent(address()); }
    /** @return the value of the {@code BuffersRec} field. */
    @NativeType("DWORD")
    public int BuffersRec() { return nBuffersRec(address()); }
    /** @return the value of the {@code BytesSent} field. */
    @NativeType("DWORD")
    public int BytesSent() { return nBytesSent(address()); }
    /** @return the value of the {@code BytesRec} field. */
    @NativeType("DWORD")
    public int BytesRec() { return nBytesRec(address()); }
    /** @return the value of the {@code msExecutionTime} field. */
    @NativeType("DWORD")
    public int msExecutionTime() { return nmsExecutionTime(address()); }
    /** @return the value of the {@code msNetWorkServerTime} field. */
    @NativeType("DWORD")
    public int msNetWorkServerTime() { return nmsNetWorkServerTime(address()); }

    /** Sets the specified value to the {@code TimerResolution} field. */
    public SQLPERF TimerResolution(@NativeType("DWORD") int value) { nTimerResolution(address(), value); return this; }
    /** Sets the specified value to the {@code SQLidu} field. */
    public SQLPERF SQLidu(@NativeType("DWORD") int value) { nSQLidu(address(), value); return this; }
    /** Sets the specified value to the {@code SQLiduRows} field. */
    public SQLPERF SQLiduRows(@NativeType("DWORD") int value) { nSQLiduRows(address(), value); return this; }
    /** Sets the specified value to the {@code SQLSelects} field. */
    public SQLPERF SQLSelects(@NativeType("DWORD") int value) { nSQLSelects(address(), value); return this; }
    /** Sets the specified value to the {@code SQLSelectRows} field. */
    public SQLPERF SQLSelectRows(@NativeType("DWORD") int value) { nSQLSelectRows(address(), value); return this; }
    /** Sets the specified value to the {@code Transactions} field. */
    public SQLPERF Transactions(@NativeType("DWORD") int value) { nTransactions(address(), value); return this; }
    /** Sets the specified value to the {@code SQLPrepares} field. */
    public SQLPERF SQLPrepares(@NativeType("DWORD") int value) { nSQLPrepares(address(), value); return this; }
    /** Sets the specified value to the {@code ExecDirects} field. */
    public SQLPERF ExecDirects(@NativeType("DWORD") int value) { nExecDirects(address(), value); return this; }
    /** Sets the specified value to the {@code SQLExecutes} field. */
    public SQLPERF SQLExecutes(@NativeType("DWORD") int value) { nSQLExecutes(address(), value); return this; }
    /** Sets the specified value to the {@code CursorOpens} field. */
    public SQLPERF CursorOpens(@NativeType("DWORD") int value) { nCursorOpens(address(), value); return this; }
    /** Sets the specified value to the {@code CursorSize} field. */
    public SQLPERF CursorSize(@NativeType("DWORD") int value) { nCursorSize(address(), value); return this; }
    /** Sets the specified value to the {@code CursorUsed} field. */
    public SQLPERF CursorUsed(@NativeType("DWORD") int value) { nCursorUsed(address(), value); return this; }
    /** Sets the specified value to the {@code PercentCursorUsed} field. */
    public SQLPERF PercentCursorUsed(@NativeType("LDOUBLE") double value) { nPercentCursorUsed(address(), value); return this; }
    /** Sets the specified value to the {@code AvgFetchTime} field. */
    public SQLPERF AvgFetchTime(@NativeType("LDOUBLE") double value) { nAvgFetchTime(address(), value); return this; }
    /** Sets the specified value to the {@code AvgCursorSize} field. */
    public SQLPERF AvgCursorSize(@NativeType("LDOUBLE") double value) { nAvgCursorSize(address(), value); return this; }
    /** Sets the specified value to the {@code AvgCursorUsed} field. */
    public SQLPERF AvgCursorUsed(@NativeType("LDOUBLE") double value) { nAvgCursorUsed(address(), value); return this; }
    /** Sets the specified value to the {@code SQLFetchTime} field. */
    public SQLPERF SQLFetchTime(@NativeType("DWORD") int value) { nSQLFetchTime(address(), value); return this; }
    /** Sets the specified value to the {@code SQLFetchCount} field. */
    public SQLPERF SQLFetchCount(@NativeType("DWORD") int value) { nSQLFetchCount(address(), value); return this; }
    /** Sets the specified value to the {@code CurrentStmtCount} field. */
    public SQLPERF CurrentStmtCount(@NativeType("DWORD") int value) { nCurrentStmtCount(address(), value); return this; }
    /** Sets the specified value to the {@code MaxOpenStmt} field. */
    public SQLPERF MaxOpenStmt(@NativeType("DWORD") int value) { nMaxOpenStmt(address(), value); return this; }
    /** Sets the specified value to the {@code SumOpenStmt} field. */
    public SQLPERF SumOpenStmt(@NativeType("DWORD") int value) { nSumOpenStmt(address(), value); return this; }
    /** Sets the specified value to the {@code CurrentConnectionCount} field. */
    public SQLPERF CurrentConnectionCount(@NativeType("DWORD") int value) { nCurrentConnectionCount(address(), value); return this; }
    /** Sets the specified value to the {@code MaxConnectionsOpened} field. */
    public SQLPERF MaxConnectionsOpened(@NativeType("DWORD") int value) { nMaxConnectionsOpened(address(), value); return this; }
    /** Sets the specified value to the {@code SumConnectionsOpened} field. */
    public SQLPERF SumConnectionsOpened(@NativeType("DWORD") int value) { nSumConnectionsOpened(address(), value); return this; }
    /** Sets the specified value to the {@code SumConnectiontime} field. */
    public SQLPERF SumConnectiontime(@NativeType("DWORD") int value) { nSumConnectiontime(address(), value); return this; }
    /** Sets the specified value to the {@code AvgTimeOpened} field. */
    public SQLPERF AvgTimeOpened(@NativeType("LDOUBLE") double value) { nAvgTimeOpened(address(), value); return this; }
    /** Sets the specified value to the {@code ServerRndTrips} field. */
    public SQLPERF ServerRndTrips(@NativeType("DWORD") int value) { nServerRndTrips(address(), value); return this; }
    /** Sets the specified value to the {@code BuffersSent} field. */
    public SQLPERF BuffersSent(@NativeType("DWORD") int value) { nBuffersSent(address(), value); return this; }
    /** Sets the specified value to the {@code BuffersRec} field. */
    public SQLPERF BuffersRec(@NativeType("DWORD") int value) { nBuffersRec(address(), value); return this; }
    /** Sets the specified value to the {@code BytesSent} field. */
    public SQLPERF BytesSent(@NativeType("DWORD") int value) { nBytesSent(address(), value); return this; }
    /** Sets the specified value to the {@code BytesRec} field. */
    public SQLPERF BytesRec(@NativeType("DWORD") int value) { nBytesRec(address(), value); return this; }
    /** Sets the specified value to the {@code msExecutionTime} field. */
    public SQLPERF msExecutionTime(@NativeType("DWORD") int value) { nmsExecutionTime(address(), value); return this; }
    /** Sets the specified value to the {@code msNetWorkServerTime} field. */
    public SQLPERF msNetWorkServerTime(@NativeType("DWORD") int value) { nmsNetWorkServerTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQLPERF set(
        int TimerResolution,
        int SQLidu,
        int SQLiduRows,
        int SQLSelects,
        int SQLSelectRows,
        int Transactions,
        int SQLPrepares,
        int ExecDirects,
        int SQLExecutes,
        int CursorOpens,
        int CursorSize,
        int CursorUsed,
        double PercentCursorUsed,
        double AvgFetchTime,
        double AvgCursorSize,
        double AvgCursorUsed,
        int SQLFetchTime,
        int SQLFetchCount,
        int CurrentStmtCount,
        int MaxOpenStmt,
        int SumOpenStmt,
        int CurrentConnectionCount,
        int MaxConnectionsOpened,
        int SumConnectionsOpened,
        int SumConnectiontime,
        double AvgTimeOpened,
        int ServerRndTrips,
        int BuffersSent,
        int BuffersRec,
        int BytesSent,
        int BytesRec,
        int msExecutionTime,
        int msNetWorkServerTime
    ) {
        TimerResolution(TimerResolution);
        SQLidu(SQLidu);
        SQLiduRows(SQLiduRows);
        SQLSelects(SQLSelects);
        SQLSelectRows(SQLSelectRows);
        Transactions(Transactions);
        SQLPrepares(SQLPrepares);
        ExecDirects(ExecDirects);
        SQLExecutes(SQLExecutes);
        CursorOpens(CursorOpens);
        CursorSize(CursorSize);
        CursorUsed(CursorUsed);
        PercentCursorUsed(PercentCursorUsed);
        AvgFetchTime(AvgFetchTime);
        AvgCursorSize(AvgCursorSize);
        AvgCursorUsed(AvgCursorUsed);
        SQLFetchTime(SQLFetchTime);
        SQLFetchCount(SQLFetchCount);
        CurrentStmtCount(CurrentStmtCount);
        MaxOpenStmt(MaxOpenStmt);
        SumOpenStmt(SumOpenStmt);
        CurrentConnectionCount(CurrentConnectionCount);
        MaxConnectionsOpened(MaxConnectionsOpened);
        SumConnectionsOpened(SumConnectionsOpened);
        SumConnectiontime(SumConnectiontime);
        AvgTimeOpened(AvgTimeOpened);
        ServerRndTrips(ServerRndTrips);
        BuffersSent(BuffersSent);
        BuffersRec(BuffersRec);
        BytesSent(BytesSent);
        BytesRec(BytesRec);
        msExecutionTime(msExecutionTime);
        msNetWorkServerTime(msNetWorkServerTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQLPERF set(SQLPERF src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQLPERF} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQLPERF malloc() {
        return wrap(SQLPERF.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SQLPERF} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQLPERF calloc() {
        return wrap(SQLPERF.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SQLPERF} instance allocated with {@link BufferUtils}. */
    public static SQLPERF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SQLPERF.class, memAddress(container), container);
    }

    /** Returns a new {@code SQLPERF} instance for the specified memory address. */
    public static SQLPERF create(long address) {
        return wrap(SQLPERF.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQLPERF createSafe(long address) {
        return address == NULL ? null : wrap(SQLPERF.class, address);
    }

    /**
     * Returns a new {@link SQLPERF.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQLPERF.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQLPERF.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SQLPERF.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQLPERF.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQLPERF mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQLPERF callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQLPERF mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQLPERF callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQLPERF.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQLPERF.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQLPERF.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQLPERF.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQLPERF} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQLPERF malloc(MemoryStack stack) {
        return wrap(SQLPERF.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SQLPERF} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQLPERF calloc(MemoryStack stack) {
        return wrap(SQLPERF.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQLPERF.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQLPERF.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQLPERF.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #TimerResolution}. */
    public static int nTimerResolution(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.TIMERRESOLUTION); }
    /** Unsafe version of {@link #SQLidu}. */
    public static int nSQLidu(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLIDU); }
    /** Unsafe version of {@link #SQLiduRows}. */
    public static int nSQLiduRows(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLIDUROWS); }
    /** Unsafe version of {@link #SQLSelects}. */
    public static int nSQLSelects(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLSELECTS); }
    /** Unsafe version of {@link #SQLSelectRows}. */
    public static int nSQLSelectRows(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLSELECTROWS); }
    /** Unsafe version of {@link #Transactions}. */
    public static int nTransactions(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.TRANSACTIONS); }
    /** Unsafe version of {@link #SQLPrepares}. */
    public static int nSQLPrepares(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLPREPARES); }
    /** Unsafe version of {@link #ExecDirects}. */
    public static int nExecDirects(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.EXECDIRECTS); }
    /** Unsafe version of {@link #SQLExecutes}. */
    public static int nSQLExecutes(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLEXECUTES); }
    /** Unsafe version of {@link #CursorOpens}. */
    public static int nCursorOpens(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.CURSOROPENS); }
    /** Unsafe version of {@link #CursorSize}. */
    public static int nCursorSize(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.CURSORSIZE); }
    /** Unsafe version of {@link #CursorUsed}. */
    public static int nCursorUsed(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.CURSORUSED); }
    /** Unsafe version of {@link #PercentCursorUsed}. */
    public static double nPercentCursorUsed(long struct) { return UNSAFE.getDouble(null, struct + SQLPERF.PERCENTCURSORUSED); }
    /** Unsafe version of {@link #AvgFetchTime}. */
    public static double nAvgFetchTime(long struct) { return UNSAFE.getDouble(null, struct + SQLPERF.AVGFETCHTIME); }
    /** Unsafe version of {@link #AvgCursorSize}. */
    public static double nAvgCursorSize(long struct) { return UNSAFE.getDouble(null, struct + SQLPERF.AVGCURSORSIZE); }
    /** Unsafe version of {@link #AvgCursorUsed}. */
    public static double nAvgCursorUsed(long struct) { return UNSAFE.getDouble(null, struct + SQLPERF.AVGCURSORUSED); }
    /** Unsafe version of {@link #SQLFetchTime}. */
    public static int nSQLFetchTime(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLFETCHTIME); }
    /** Unsafe version of {@link #SQLFetchCount}. */
    public static int nSQLFetchCount(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SQLFETCHCOUNT); }
    /** Unsafe version of {@link #CurrentStmtCount}. */
    public static int nCurrentStmtCount(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.CURRENTSTMTCOUNT); }
    /** Unsafe version of {@link #MaxOpenStmt}. */
    public static int nMaxOpenStmt(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.MAXOPENSTMT); }
    /** Unsafe version of {@link #SumOpenStmt}. */
    public static int nSumOpenStmt(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SUMOPENSTMT); }
    /** Unsafe version of {@link #CurrentConnectionCount}. */
    public static int nCurrentConnectionCount(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.CURRENTCONNECTIONCOUNT); }
    /** Unsafe version of {@link #MaxConnectionsOpened}. */
    public static int nMaxConnectionsOpened(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.MAXCONNECTIONSOPENED); }
    /** Unsafe version of {@link #SumConnectionsOpened}. */
    public static int nSumConnectionsOpened(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SUMCONNECTIONSOPENED); }
    /** Unsafe version of {@link #SumConnectiontime}. */
    public static int nSumConnectiontime(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SUMCONNECTIONTIME); }
    /** Unsafe version of {@link #AvgTimeOpened}. */
    public static double nAvgTimeOpened(long struct) { return UNSAFE.getDouble(null, struct + SQLPERF.AVGTIMEOPENED); }
    /** Unsafe version of {@link #ServerRndTrips}. */
    public static int nServerRndTrips(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.SERVERRNDTRIPS); }
    /** Unsafe version of {@link #BuffersSent}. */
    public static int nBuffersSent(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.BUFFERSSENT); }
    /** Unsafe version of {@link #BuffersRec}. */
    public static int nBuffersRec(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.BUFFERSREC); }
    /** Unsafe version of {@link #BytesSent}. */
    public static int nBytesSent(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.BYTESSENT); }
    /** Unsafe version of {@link #BytesRec}. */
    public static int nBytesRec(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.BYTESREC); }
    /** Unsafe version of {@link #msExecutionTime}. */
    public static int nmsExecutionTime(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.MSEXECUTIONTIME); }
    /** Unsafe version of {@link #msNetWorkServerTime}. */
    public static int nmsNetWorkServerTime(long struct) { return UNSAFE.getInt(null, struct + SQLPERF.MSNETWORKSERVERTIME); }

    /** Unsafe version of {@link #TimerResolution(int) TimerResolution}. */
    public static void nTimerResolution(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.TIMERRESOLUTION, value); }
    /** Unsafe version of {@link #SQLidu(int) SQLidu}. */
    public static void nSQLidu(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLIDU, value); }
    /** Unsafe version of {@link #SQLiduRows(int) SQLiduRows}. */
    public static void nSQLiduRows(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLIDUROWS, value); }
    /** Unsafe version of {@link #SQLSelects(int) SQLSelects}. */
    public static void nSQLSelects(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLSELECTS, value); }
    /** Unsafe version of {@link #SQLSelectRows(int) SQLSelectRows}. */
    public static void nSQLSelectRows(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLSELECTROWS, value); }
    /** Unsafe version of {@link #Transactions(int) Transactions}. */
    public static void nTransactions(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.TRANSACTIONS, value); }
    /** Unsafe version of {@link #SQLPrepares(int) SQLPrepares}. */
    public static void nSQLPrepares(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLPREPARES, value); }
    /** Unsafe version of {@link #ExecDirects(int) ExecDirects}. */
    public static void nExecDirects(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.EXECDIRECTS, value); }
    /** Unsafe version of {@link #SQLExecutes(int) SQLExecutes}. */
    public static void nSQLExecutes(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLEXECUTES, value); }
    /** Unsafe version of {@link #CursorOpens(int) CursorOpens}. */
    public static void nCursorOpens(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.CURSOROPENS, value); }
    /** Unsafe version of {@link #CursorSize(int) CursorSize}. */
    public static void nCursorSize(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.CURSORSIZE, value); }
    /** Unsafe version of {@link #CursorUsed(int) CursorUsed}. */
    public static void nCursorUsed(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.CURSORUSED, value); }
    /** Unsafe version of {@link #PercentCursorUsed(double) PercentCursorUsed}. */
    public static void nPercentCursorUsed(long struct, double value) { UNSAFE.putDouble(null, struct + SQLPERF.PERCENTCURSORUSED, value); }
    /** Unsafe version of {@link #AvgFetchTime(double) AvgFetchTime}. */
    public static void nAvgFetchTime(long struct, double value) { UNSAFE.putDouble(null, struct + SQLPERF.AVGFETCHTIME, value); }
    /** Unsafe version of {@link #AvgCursorSize(double) AvgCursorSize}. */
    public static void nAvgCursorSize(long struct, double value) { UNSAFE.putDouble(null, struct + SQLPERF.AVGCURSORSIZE, value); }
    /** Unsafe version of {@link #AvgCursorUsed(double) AvgCursorUsed}. */
    public static void nAvgCursorUsed(long struct, double value) { UNSAFE.putDouble(null, struct + SQLPERF.AVGCURSORUSED, value); }
    /** Unsafe version of {@link #SQLFetchTime(int) SQLFetchTime}. */
    public static void nSQLFetchTime(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLFETCHTIME, value); }
    /** Unsafe version of {@link #SQLFetchCount(int) SQLFetchCount}. */
    public static void nSQLFetchCount(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SQLFETCHCOUNT, value); }
    /** Unsafe version of {@link #CurrentStmtCount(int) CurrentStmtCount}. */
    public static void nCurrentStmtCount(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.CURRENTSTMTCOUNT, value); }
    /** Unsafe version of {@link #MaxOpenStmt(int) MaxOpenStmt}. */
    public static void nMaxOpenStmt(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.MAXOPENSTMT, value); }
    /** Unsafe version of {@link #SumOpenStmt(int) SumOpenStmt}. */
    public static void nSumOpenStmt(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SUMOPENSTMT, value); }
    /** Unsafe version of {@link #CurrentConnectionCount(int) CurrentConnectionCount}. */
    public static void nCurrentConnectionCount(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.CURRENTCONNECTIONCOUNT, value); }
    /** Unsafe version of {@link #MaxConnectionsOpened(int) MaxConnectionsOpened}. */
    public static void nMaxConnectionsOpened(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.MAXCONNECTIONSOPENED, value); }
    /** Unsafe version of {@link #SumConnectionsOpened(int) SumConnectionsOpened}. */
    public static void nSumConnectionsOpened(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SUMCONNECTIONSOPENED, value); }
    /** Unsafe version of {@link #SumConnectiontime(int) SumConnectiontime}. */
    public static void nSumConnectiontime(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SUMCONNECTIONTIME, value); }
    /** Unsafe version of {@link #AvgTimeOpened(double) AvgTimeOpened}. */
    public static void nAvgTimeOpened(long struct, double value) { UNSAFE.putDouble(null, struct + SQLPERF.AVGTIMEOPENED, value); }
    /** Unsafe version of {@link #ServerRndTrips(int) ServerRndTrips}. */
    public static void nServerRndTrips(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.SERVERRNDTRIPS, value); }
    /** Unsafe version of {@link #BuffersSent(int) BuffersSent}. */
    public static void nBuffersSent(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.BUFFERSSENT, value); }
    /** Unsafe version of {@link #BuffersRec(int) BuffersRec}. */
    public static void nBuffersRec(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.BUFFERSREC, value); }
    /** Unsafe version of {@link #BytesSent(int) BytesSent}. */
    public static void nBytesSent(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.BYTESSENT, value); }
    /** Unsafe version of {@link #BytesRec(int) BytesRec}. */
    public static void nBytesRec(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.BYTESREC, value); }
    /** Unsafe version of {@link #msExecutionTime(int) msExecutionTime}. */
    public static void nmsExecutionTime(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.MSEXECUTIONTIME, value); }
    /** Unsafe version of {@link #msNetWorkServerTime(int) msNetWorkServerTime}. */
    public static void nmsNetWorkServerTime(long struct, int value) { UNSAFE.putInt(null, struct + SQLPERF.MSNETWORKSERVERTIME, value); }

    // -----------------------------------

    /** An array of {@link SQLPERF} structs. */
    public static class Buffer extends StructBuffer<SQLPERF, Buffer> implements NativeResource {

        private static final SQLPERF ELEMENT_FACTORY = SQLPERF.create(-1L);

        /**
         * Creates a new {@code SQLPERF.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQLPERF#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected SQLPERF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code TimerResolution} field. */
        @NativeType("DWORD")
        public int TimerResolution() { return SQLPERF.nTimerResolution(address()); }
        /** @return the value of the {@code SQLidu} field. */
        @NativeType("DWORD")
        public int SQLidu() { return SQLPERF.nSQLidu(address()); }
        /** @return the value of the {@code SQLiduRows} field. */
        @NativeType("DWORD")
        public int SQLiduRows() { return SQLPERF.nSQLiduRows(address()); }
        /** @return the value of the {@code SQLSelects} field. */
        @NativeType("DWORD")
        public int SQLSelects() { return SQLPERF.nSQLSelects(address()); }
        /** @return the value of the {@code SQLSelectRows} field. */
        @NativeType("DWORD")
        public int SQLSelectRows() { return SQLPERF.nSQLSelectRows(address()); }
        /** @return the value of the {@code Transactions} field. */
        @NativeType("DWORD")
        public int Transactions() { return SQLPERF.nTransactions(address()); }
        /** @return the value of the {@code SQLPrepares} field. */
        @NativeType("DWORD")
        public int SQLPrepares() { return SQLPERF.nSQLPrepares(address()); }
        /** @return the value of the {@code ExecDirects} field. */
        @NativeType("DWORD")
        public int ExecDirects() { return SQLPERF.nExecDirects(address()); }
        /** @return the value of the {@code SQLExecutes} field. */
        @NativeType("DWORD")
        public int SQLExecutes() { return SQLPERF.nSQLExecutes(address()); }
        /** @return the value of the {@code CursorOpens} field. */
        @NativeType("DWORD")
        public int CursorOpens() { return SQLPERF.nCursorOpens(address()); }
        /** @return the value of the {@code CursorSize} field. */
        @NativeType("DWORD")
        public int CursorSize() { return SQLPERF.nCursorSize(address()); }
        /** @return the value of the {@code CursorUsed} field. */
        @NativeType("DWORD")
        public int CursorUsed() { return SQLPERF.nCursorUsed(address()); }
        /** @return the value of the {@code PercentCursorUsed} field. */
        @NativeType("LDOUBLE")
        public double PercentCursorUsed() { return SQLPERF.nPercentCursorUsed(address()); }
        /** @return the value of the {@code AvgFetchTime} field. */
        @NativeType("LDOUBLE")
        public double AvgFetchTime() { return SQLPERF.nAvgFetchTime(address()); }
        /** @return the value of the {@code AvgCursorSize} field. */
        @NativeType("LDOUBLE")
        public double AvgCursorSize() { return SQLPERF.nAvgCursorSize(address()); }
        /** @return the value of the {@code AvgCursorUsed} field. */
        @NativeType("LDOUBLE")
        public double AvgCursorUsed() { return SQLPERF.nAvgCursorUsed(address()); }
        /** @return the value of the {@code SQLFetchTime} field. */
        @NativeType("DWORD")
        public int SQLFetchTime() { return SQLPERF.nSQLFetchTime(address()); }
        /** @return the value of the {@code SQLFetchCount} field. */
        @NativeType("DWORD")
        public int SQLFetchCount() { return SQLPERF.nSQLFetchCount(address()); }
        /** @return the value of the {@code CurrentStmtCount} field. */
        @NativeType("DWORD")
        public int CurrentStmtCount() { return SQLPERF.nCurrentStmtCount(address()); }
        /** @return the value of the {@code MaxOpenStmt} field. */
        @NativeType("DWORD")
        public int MaxOpenStmt() { return SQLPERF.nMaxOpenStmt(address()); }
        /** @return the value of the {@code SumOpenStmt} field. */
        @NativeType("DWORD")
        public int SumOpenStmt() { return SQLPERF.nSumOpenStmt(address()); }
        /** @return the value of the {@code CurrentConnectionCount} field. */
        @NativeType("DWORD")
        public int CurrentConnectionCount() { return SQLPERF.nCurrentConnectionCount(address()); }
        /** @return the value of the {@code MaxConnectionsOpened} field. */
        @NativeType("DWORD")
        public int MaxConnectionsOpened() { return SQLPERF.nMaxConnectionsOpened(address()); }
        /** @return the value of the {@code SumConnectionsOpened} field. */
        @NativeType("DWORD")
        public int SumConnectionsOpened() { return SQLPERF.nSumConnectionsOpened(address()); }
        /** @return the value of the {@code SumConnectiontime} field. */
        @NativeType("DWORD")
        public int SumConnectiontime() { return SQLPERF.nSumConnectiontime(address()); }
        /** @return the value of the {@code AvgTimeOpened} field. */
        @NativeType("LDOUBLE")
        public double AvgTimeOpened() { return SQLPERF.nAvgTimeOpened(address()); }
        /** @return the value of the {@code ServerRndTrips} field. */
        @NativeType("DWORD")
        public int ServerRndTrips() { return SQLPERF.nServerRndTrips(address()); }
        /** @return the value of the {@code BuffersSent} field. */
        @NativeType("DWORD")
        public int BuffersSent() { return SQLPERF.nBuffersSent(address()); }
        /** @return the value of the {@code BuffersRec} field. */
        @NativeType("DWORD")
        public int BuffersRec() { return SQLPERF.nBuffersRec(address()); }
        /** @return the value of the {@code BytesSent} field. */
        @NativeType("DWORD")
        public int BytesSent() { return SQLPERF.nBytesSent(address()); }
        /** @return the value of the {@code BytesRec} field. */
        @NativeType("DWORD")
        public int BytesRec() { return SQLPERF.nBytesRec(address()); }
        /** @return the value of the {@code msExecutionTime} field. */
        @NativeType("DWORD")
        public int msExecutionTime() { return SQLPERF.nmsExecutionTime(address()); }
        /** @return the value of the {@code msNetWorkServerTime} field. */
        @NativeType("DWORD")
        public int msNetWorkServerTime() { return SQLPERF.nmsNetWorkServerTime(address()); }

        /** Sets the specified value to the {@code TimerResolution} field. */
        public SQLPERF.Buffer TimerResolution(@NativeType("DWORD") int value) { SQLPERF.nTimerResolution(address(), value); return this; }
        /** Sets the specified value to the {@code SQLidu} field. */
        public SQLPERF.Buffer SQLidu(@NativeType("DWORD") int value) { SQLPERF.nSQLidu(address(), value); return this; }
        /** Sets the specified value to the {@code SQLiduRows} field. */
        public SQLPERF.Buffer SQLiduRows(@NativeType("DWORD") int value) { SQLPERF.nSQLiduRows(address(), value); return this; }
        /** Sets the specified value to the {@code SQLSelects} field. */
        public SQLPERF.Buffer SQLSelects(@NativeType("DWORD") int value) { SQLPERF.nSQLSelects(address(), value); return this; }
        /** Sets the specified value to the {@code SQLSelectRows} field. */
        public SQLPERF.Buffer SQLSelectRows(@NativeType("DWORD") int value) { SQLPERF.nSQLSelectRows(address(), value); return this; }
        /** Sets the specified value to the {@code Transactions} field. */
        public SQLPERF.Buffer Transactions(@NativeType("DWORD") int value) { SQLPERF.nTransactions(address(), value); return this; }
        /** Sets the specified value to the {@code SQLPrepares} field. */
        public SQLPERF.Buffer SQLPrepares(@NativeType("DWORD") int value) { SQLPERF.nSQLPrepares(address(), value); return this; }
        /** Sets the specified value to the {@code ExecDirects} field. */
        public SQLPERF.Buffer ExecDirects(@NativeType("DWORD") int value) { SQLPERF.nExecDirects(address(), value); return this; }
        /** Sets the specified value to the {@code SQLExecutes} field. */
        public SQLPERF.Buffer SQLExecutes(@NativeType("DWORD") int value) { SQLPERF.nSQLExecutes(address(), value); return this; }
        /** Sets the specified value to the {@code CursorOpens} field. */
        public SQLPERF.Buffer CursorOpens(@NativeType("DWORD") int value) { SQLPERF.nCursorOpens(address(), value); return this; }
        /** Sets the specified value to the {@code CursorSize} field. */
        public SQLPERF.Buffer CursorSize(@NativeType("DWORD") int value) { SQLPERF.nCursorSize(address(), value); return this; }
        /** Sets the specified value to the {@code CursorUsed} field. */
        public SQLPERF.Buffer CursorUsed(@NativeType("DWORD") int value) { SQLPERF.nCursorUsed(address(), value); return this; }
        /** Sets the specified value to the {@code PercentCursorUsed} field. */
        public SQLPERF.Buffer PercentCursorUsed(@NativeType("LDOUBLE") double value) { SQLPERF.nPercentCursorUsed(address(), value); return this; }
        /** Sets the specified value to the {@code AvgFetchTime} field. */
        public SQLPERF.Buffer AvgFetchTime(@NativeType("LDOUBLE") double value) { SQLPERF.nAvgFetchTime(address(), value); return this; }
        /** Sets the specified value to the {@code AvgCursorSize} field. */
        public SQLPERF.Buffer AvgCursorSize(@NativeType("LDOUBLE") double value) { SQLPERF.nAvgCursorSize(address(), value); return this; }
        /** Sets the specified value to the {@code AvgCursorUsed} field. */
        public SQLPERF.Buffer AvgCursorUsed(@NativeType("LDOUBLE") double value) { SQLPERF.nAvgCursorUsed(address(), value); return this; }
        /** Sets the specified value to the {@code SQLFetchTime} field. */
        public SQLPERF.Buffer SQLFetchTime(@NativeType("DWORD") int value) { SQLPERF.nSQLFetchTime(address(), value); return this; }
        /** Sets the specified value to the {@code SQLFetchCount} field. */
        public SQLPERF.Buffer SQLFetchCount(@NativeType("DWORD") int value) { SQLPERF.nSQLFetchCount(address(), value); return this; }
        /** Sets the specified value to the {@code CurrentStmtCount} field. */
        public SQLPERF.Buffer CurrentStmtCount(@NativeType("DWORD") int value) { SQLPERF.nCurrentStmtCount(address(), value); return this; }
        /** Sets the specified value to the {@code MaxOpenStmt} field. */
        public SQLPERF.Buffer MaxOpenStmt(@NativeType("DWORD") int value) { SQLPERF.nMaxOpenStmt(address(), value); return this; }
        /** Sets the specified value to the {@code SumOpenStmt} field. */
        public SQLPERF.Buffer SumOpenStmt(@NativeType("DWORD") int value) { SQLPERF.nSumOpenStmt(address(), value); return this; }
        /** Sets the specified value to the {@code CurrentConnectionCount} field. */
        public SQLPERF.Buffer CurrentConnectionCount(@NativeType("DWORD") int value) { SQLPERF.nCurrentConnectionCount(address(), value); return this; }
        /** Sets the specified value to the {@code MaxConnectionsOpened} field. */
        public SQLPERF.Buffer MaxConnectionsOpened(@NativeType("DWORD") int value) { SQLPERF.nMaxConnectionsOpened(address(), value); return this; }
        /** Sets the specified value to the {@code SumConnectionsOpened} field. */
        public SQLPERF.Buffer SumConnectionsOpened(@NativeType("DWORD") int value) { SQLPERF.nSumConnectionsOpened(address(), value); return this; }
        /** Sets the specified value to the {@code SumConnectiontime} field. */
        public SQLPERF.Buffer SumConnectiontime(@NativeType("DWORD") int value) { SQLPERF.nSumConnectiontime(address(), value); return this; }
        /** Sets the specified value to the {@code AvgTimeOpened} field. */
        public SQLPERF.Buffer AvgTimeOpened(@NativeType("LDOUBLE") double value) { SQLPERF.nAvgTimeOpened(address(), value); return this; }
        /** Sets the specified value to the {@code ServerRndTrips} field. */
        public SQLPERF.Buffer ServerRndTrips(@NativeType("DWORD") int value) { SQLPERF.nServerRndTrips(address(), value); return this; }
        /** Sets the specified value to the {@code BuffersSent} field. */
        public SQLPERF.Buffer BuffersSent(@NativeType("DWORD") int value) { SQLPERF.nBuffersSent(address(), value); return this; }
        /** Sets the specified value to the {@code BuffersRec} field. */
        public SQLPERF.Buffer BuffersRec(@NativeType("DWORD") int value) { SQLPERF.nBuffersRec(address(), value); return this; }
        /** Sets the specified value to the {@code BytesSent} field. */
        public SQLPERF.Buffer BytesSent(@NativeType("DWORD") int value) { SQLPERF.nBytesSent(address(), value); return this; }
        /** Sets the specified value to the {@code BytesRec} field. */
        public SQLPERF.Buffer BytesRec(@NativeType("DWORD") int value) { SQLPERF.nBytesRec(address(), value); return this; }
        /** Sets the specified value to the {@code msExecutionTime} field. */
        public SQLPERF.Buffer msExecutionTime(@NativeType("DWORD") int value) { SQLPERF.nmsExecutionTime(address(), value); return this; }
        /** Sets the specified value to the {@code msNetWorkServerTime} field. */
        public SQLPERF.Buffer msNetWorkServerTime(@NativeType("DWORD") int value) { SQLPERF.nmsNetWorkServerTime(address(), value); return this; }

    }

}