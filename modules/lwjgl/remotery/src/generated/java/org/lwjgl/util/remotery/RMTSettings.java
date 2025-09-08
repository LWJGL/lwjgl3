/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct rmtSettings {
 *     rmtU16 port;
 *     rmtBool reuse_open_port;
 *     rmtBool limit_connections_to_localhost;
 *     rmtBool enableThreadSampler;
 *     rmtU32 msSleepBetweenServerUpdates;
 *     rmtU32 messageQueueSizeInBytes;
 *     rmtU32 maxNbMessagesPerUpdate;
 *     {@link RMTMallocI rmtMallocPtr} _malloc;
 *     {@link RMTReallocI rmtReallocPtr} realloc;
 *     {@link RMTFreeI rmtFreePtr} _free;
 *     void * mm_context;
 *     {@link RMTInputHandlerI rmtInputHandlerPtr} input_handler;
 *     {@link RMTSampleTreeHandlerI rmtSampleTreeHandlerPtr} sampletree_handler;
 *     void * sampletree_context;
 *     {@link RMTPropertyHandlerI rmtPropertyHandlerPtr} snapshot_callback;
 *     void * snapshot_context;
 *     void * input_handler_context;
 *     rmtPStr logPath;
 * }</code></pre>
 */
@NativeType("struct rmtSettings")
public class RMTSettings extends Struct<RMTSettings> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PORT,
        REUSE_OPEN_PORT,
        LIMIT_CONNECTIONS_TO_LOCALHOST,
        ENABLETHREADSAMPLER,
        MSSLEEPBETWEENSERVERUPDATES,
        MESSAGEQUEUESIZEINBYTES,
        MAXNBMESSAGESPERUPDATE,
        _MALLOC,
        REALLOC,
        _FREE,
        MM_CONTEXT,
        INPUT_HANDLER,
        SAMPLETREE_HANDLER,
        SAMPLETREE_CONTEXT,
        SNAPSHOT_CALLBACK,
        SNAPSHOT_CONTEXT,
        INPUT_HANDLER_CONTEXT,
        LOGPATH;

    static {
        Layout layout = __struct(
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PORT = layout.offsetof(0);
        REUSE_OPEN_PORT = layout.offsetof(1);
        LIMIT_CONNECTIONS_TO_LOCALHOST = layout.offsetof(2);
        ENABLETHREADSAMPLER = layout.offsetof(3);
        MSSLEEPBETWEENSERVERUPDATES = layout.offsetof(4);
        MESSAGEQUEUESIZEINBYTES = layout.offsetof(5);
        MAXNBMESSAGESPERUPDATE = layout.offsetof(6);
        _MALLOC = layout.offsetof(7);
        REALLOC = layout.offsetof(8);
        _FREE = layout.offsetof(9);
        MM_CONTEXT = layout.offsetof(10);
        INPUT_HANDLER = layout.offsetof(11);
        SAMPLETREE_HANDLER = layout.offsetof(12);
        SAMPLETREE_CONTEXT = layout.offsetof(13);
        SNAPSHOT_CALLBACK = layout.offsetof(14);
        SNAPSHOT_CONTEXT = layout.offsetof(15);
        INPUT_HANDLER_CONTEXT = layout.offsetof(16);
        LOGPATH = layout.offsetof(17);
    }

    protected RMTSettings(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTSettings create(long address, @Nullable ByteBuffer container) {
        return new RMTSettings(address, container);
    }

    /**
     * Creates a {@code RMTSettings} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTSettings(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code port} field. */
    @NativeType("rmtU16")
    public short port() { return nport(address()); }
    /** @return the value of the {@code reuse_open_port} field. */
    @NativeType("rmtBool")
    public boolean reuse_open_port() { return nreuse_open_port(address()) != 0; }
    /** @return the value of the {@code limit_connections_to_localhost} field. */
    @NativeType("rmtBool")
    public boolean limit_connections_to_localhost() { return nlimit_connections_to_localhost(address()) != 0; }
    /** @return the value of the {@code enableThreadSampler} field. */
    @NativeType("rmtBool")
    public boolean enableThreadSampler() { return nenableThreadSampler(address()) != 0; }
    /** @return the value of the {@code msSleepBetweenServerUpdates} field. */
    @NativeType("rmtU32")
    public int msSleepBetweenServerUpdates() { return nmsSleepBetweenServerUpdates(address()); }
    /** @return the value of the {@code messageQueueSizeInBytes} field. */
    @NativeType("rmtU32")
    public int messageQueueSizeInBytes() { return nmessageQueueSizeInBytes(address()); }
    /** @return the value of the {@code maxNbMessagesPerUpdate} field. */
    @NativeType("rmtU32")
    public int maxNbMessagesPerUpdate() { return nmaxNbMessagesPerUpdate(address()); }
    /** @return the value of the {@code _malloc} field. */
    @NativeType("rmtMallocPtr")
    public RMTMalloc _malloc() { return n_malloc(address()); }
    /** @return the value of the {@code realloc} field. */
    @NativeType("rmtReallocPtr")
    public RMTRealloc realloc() { return nrealloc(address()); }
    /** @return the value of the {@code _free} field. */
    @NativeType("rmtFreePtr")
    public RMTFree _free() { return n_free(address()); }
    /** @return the value of the {@code mm_context} field. */
    @NativeType("void *")
    public long mm_context() { return nmm_context(address()); }
    /** @return the value of the {@code input_handler} field. */
    @NativeType("rmtInputHandlerPtr")
    public @Nullable RMTInputHandler input_handler() { return ninput_handler(address()); }
    /** @return the value of the {@code sampletree_handler} field. */
    @NativeType("rmtSampleTreeHandlerPtr")
    public @Nullable RMTSampleTreeHandler sampletree_handler() { return nsampletree_handler(address()); }
    /** @return the value of the {@code sampletree_context} field. */
    @NativeType("void *")
    public long sampletree_context() { return nsampletree_context(address()); }
    /** @return the value of the {@code snapshot_callback} field. */
    @NativeType("rmtPropertyHandlerPtr")
    public @Nullable RMTPropertyHandler snapshot_callback() { return nsnapshot_callback(address()); }
    /** @return the value of the {@code snapshot_context} field. */
    @NativeType("void *")
    public long snapshot_context() { return nsnapshot_context(address()); }
    /** @return the value of the {@code input_handler_context} field. */
    @NativeType("void *")
    public long input_handler_context() { return ninput_handler_context(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code logPath} field. */
    @NativeType("rmtPStr")
    public @Nullable ByteBuffer logPath() { return nlogPath(address()); }
    /** @return the null-terminated string pointed to by the {@code logPath} field. */
    @NativeType("rmtPStr")
    public @Nullable String logPathString() { return nlogPathString(address()); }

    /** Sets the specified value to the {@code port} field. */
    public RMTSettings port(@NativeType("rmtU16") short value) { nport(address(), value); return this; }
    /** Sets the specified value to the {@code reuse_open_port} field. */
    public RMTSettings reuse_open_port(@NativeType("rmtBool") boolean value) { nreuse_open_port(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code limit_connections_to_localhost} field. */
    public RMTSettings limit_connections_to_localhost(@NativeType("rmtBool") boolean value) { nlimit_connections_to_localhost(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enableThreadSampler} field. */
    public RMTSettings enableThreadSampler(@NativeType("rmtBool") boolean value) { nenableThreadSampler(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code msSleepBetweenServerUpdates} field. */
    public RMTSettings msSleepBetweenServerUpdates(@NativeType("rmtU32") int value) { nmsSleepBetweenServerUpdates(address(), value); return this; }
    /** Sets the specified value to the {@code messageQueueSizeInBytes} field. */
    public RMTSettings messageQueueSizeInBytes(@NativeType("rmtU32") int value) { nmessageQueueSizeInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code maxNbMessagesPerUpdate} field. */
    public RMTSettings maxNbMessagesPerUpdate(@NativeType("rmtU32") int value) { nmaxNbMessagesPerUpdate(address(), value); return this; }
    /** Sets the specified value to the {@code _malloc} field. */
    public RMTSettings _malloc(@NativeType("rmtMallocPtr") RMTMallocI value) { n_malloc(address(), value); return this; }
    /** Sets the specified value to the {@code realloc} field. */
    public RMTSettings realloc(@NativeType("rmtReallocPtr") RMTReallocI value) { nrealloc(address(), value); return this; }
    /** Sets the specified value to the {@code _free} field. */
    public RMTSettings _free(@NativeType("rmtFreePtr") RMTFreeI value) { n_free(address(), value); return this; }
    /** Sets the specified value to the {@code mm_context} field. */
    public RMTSettings mm_context(@NativeType("void *") long value) { nmm_context(address(), value); return this; }
    /** Sets the specified value to the {@code input_handler} field. */
    public RMTSettings input_handler(@Nullable @NativeType("rmtInputHandlerPtr") RMTInputHandlerI value) { ninput_handler(address(), value); return this; }
    /** Sets the specified value to the {@code sampletree_handler} field. */
    public RMTSettings sampletree_handler(@Nullable @NativeType("rmtSampleTreeHandlerPtr") RMTSampleTreeHandlerI value) { nsampletree_handler(address(), value); return this; }
    /** Sets the specified value to the {@code sampletree_context} field. */
    public RMTSettings sampletree_context(@NativeType("void *") long value) { nsampletree_context(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot_callback} field. */
    public RMTSettings snapshot_callback(@Nullable @NativeType("rmtPropertyHandlerPtr") RMTPropertyHandlerI value) { nsnapshot_callback(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot_context} field. */
    public RMTSettings snapshot_context(@NativeType("void *") long value) { nsnapshot_context(address(), value); return this; }
    /** Sets the specified value to the {@code input_handler_context} field. */
    public RMTSettings input_handler_context(@NativeType("void *") long value) { ninput_handler_context(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code logPath} field. */
    public RMTSettings logPath(@Nullable @NativeType("rmtPStr") ByteBuffer value) { nlogPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RMTSettings set(
        short port,
        boolean reuse_open_port,
        boolean limit_connections_to_localhost,
        boolean enableThreadSampler,
        int msSleepBetweenServerUpdates,
        int messageQueueSizeInBytes,
        int maxNbMessagesPerUpdate,
        RMTMallocI _malloc,
        RMTReallocI realloc,
        RMTFreeI _free,
        long mm_context,
        @Nullable RMTInputHandlerI input_handler,
        @Nullable RMTSampleTreeHandlerI sampletree_handler,
        long sampletree_context,
        @Nullable RMTPropertyHandlerI snapshot_callback,
        long snapshot_context,
        long input_handler_context,
        @Nullable ByteBuffer logPath
    ) {
        port(port);
        reuse_open_port(reuse_open_port);
        limit_connections_to_localhost(limit_connections_to_localhost);
        enableThreadSampler(enableThreadSampler);
        msSleepBetweenServerUpdates(msSleepBetweenServerUpdates);
        messageQueueSizeInBytes(messageQueueSizeInBytes);
        maxNbMessagesPerUpdate(maxNbMessagesPerUpdate);
        _malloc(_malloc);
        realloc(realloc);
        _free(_free);
        mm_context(mm_context);
        input_handler(input_handler);
        sampletree_handler(sampletree_handler);
        sampletree_context(sampletree_context);
        snapshot_callback(snapshot_callback);
        snapshot_context(snapshot_context);
        input_handler_context(input_handler_context);
        logPath(logPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RMTSettings set(RMTSettings src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RMTSettings} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTSettings malloc() {
        return new RMTSettings(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTSettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTSettings calloc() {
        return new RMTSettings(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTSettings} instance allocated with {@link BufferUtils}. */
    public static RMTSettings create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTSettings(memAddress(container), container);
    }

    /** Returns a new {@code RMTSettings} instance for the specified memory address. */
    public static RMTSettings create(long address) {
        return new RMTSettings(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RMTSettings createSafe(long address) {
        return address == NULL ? null : new RMTSettings(address, null);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RMTSettings mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RMTSettings callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RMTSettings mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RMTSettings callocStack(MemoryStack stack) { return calloc(stack); }

    /**
     * Returns a new {@code RMTSettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings malloc(MemoryStack stack) {
        return new RMTSettings(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTSettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings calloc(MemoryStack stack) {
        return new RMTSettings(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #port}. */
    public static short nport(long struct) { return memGetShort(struct + RMTSettings.PORT); }
    /** Unsafe version of {@link #reuse_open_port}. */
    public static int nreuse_open_port(long struct) { return memGetInt(struct + RMTSettings.REUSE_OPEN_PORT); }
    /** Unsafe version of {@link #limit_connections_to_localhost}. */
    public static int nlimit_connections_to_localhost(long struct) { return memGetInt(struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST); }
    /** Unsafe version of {@link #enableThreadSampler}. */
    public static int nenableThreadSampler(long struct) { return memGetInt(struct + RMTSettings.ENABLETHREADSAMPLER); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates}. */
    public static int nmsSleepBetweenServerUpdates(long struct) { return memGetInt(struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES); }
    /** Unsafe version of {@link #messageQueueSizeInBytes}. */
    public static int nmessageQueueSizeInBytes(long struct) { return memGetInt(struct + RMTSettings.MESSAGEQUEUESIZEINBYTES); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate}. */
    public static int nmaxNbMessagesPerUpdate(long struct) { return memGetInt(struct + RMTSettings.MAXNBMESSAGESPERUPDATE); }
    /** Unsafe version of {@link #_malloc}. */
    public static RMTMalloc n_malloc(long struct) { return RMTMalloc.create(memGetAddress(struct + RMTSettings._MALLOC)); }
    /** Unsafe version of {@link #realloc}. */
    public static RMTRealloc nrealloc(long struct) { return RMTRealloc.create(memGetAddress(struct + RMTSettings.REALLOC)); }
    /** Unsafe version of {@link #_free}. */
    public static RMTFree n_free(long struct) { return RMTFree.create(memGetAddress(struct + RMTSettings._FREE)); }
    /** Unsafe version of {@link #mm_context}. */
    public static long nmm_context(long struct) { return memGetAddress(struct + RMTSettings.MM_CONTEXT); }
    /** Unsafe version of {@link #input_handler}. */
    public static @Nullable RMTInputHandler ninput_handler(long struct) { return RMTInputHandler.createSafe(memGetAddress(struct + RMTSettings.INPUT_HANDLER)); }
    /** Unsafe version of {@link #sampletree_handler}. */
    public static @Nullable RMTSampleTreeHandler nsampletree_handler(long struct) { return RMTSampleTreeHandler.createSafe(memGetAddress(struct + RMTSettings.SAMPLETREE_HANDLER)); }
    /** Unsafe version of {@link #sampletree_context}. */
    public static long nsampletree_context(long struct) { return memGetAddress(struct + RMTSettings.SAMPLETREE_CONTEXT); }
    /** Unsafe version of {@link #snapshot_callback}. */
    public static @Nullable RMTPropertyHandler nsnapshot_callback(long struct) { return RMTPropertyHandler.createSafe(memGetAddress(struct + RMTSettings.SNAPSHOT_CALLBACK)); }
    /** Unsafe version of {@link #snapshot_context}. */
    public static long nsnapshot_context(long struct) { return memGetAddress(struct + RMTSettings.SNAPSHOT_CONTEXT); }
    /** Unsafe version of {@link #input_handler_context}. */
    public static long ninput_handler_context(long struct) { return memGetAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT); }
    /** Unsafe version of {@link #logPath}. */
    public static @Nullable ByteBuffer nlogPath(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + RMTSettings.LOGPATH)); }
    /** Unsafe version of {@link #logPathString}. */
    public static @Nullable String nlogPathString(long struct) { return memUTF8Safe(memGetAddress(struct + RMTSettings.LOGPATH)); }

    /** Unsafe version of {@link #port(short) port}. */
    public static void nport(long struct, short value) { memPutShort(struct + RMTSettings.PORT, value); }
    /** Unsafe version of {@link #reuse_open_port(boolean) reuse_open_port}. */
    public static void nreuse_open_port(long struct, int value) { memPutInt(struct + RMTSettings.REUSE_OPEN_PORT, value); }
    /** Unsafe version of {@link #limit_connections_to_localhost(boolean) limit_connections_to_localhost}. */
    public static void nlimit_connections_to_localhost(long struct, int value) { memPutInt(struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST, value); }
    /** Unsafe version of {@link #enableThreadSampler(boolean) enableThreadSampler}. */
    public static void nenableThreadSampler(long struct, int value) { memPutInt(struct + RMTSettings.ENABLETHREADSAMPLER, value); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates(int) msSleepBetweenServerUpdates}. */
    public static void nmsSleepBetweenServerUpdates(long struct, int value) { memPutInt(struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES, value); }
    /** Unsafe version of {@link #messageQueueSizeInBytes(int) messageQueueSizeInBytes}. */
    public static void nmessageQueueSizeInBytes(long struct, int value) { memPutInt(struct + RMTSettings.MESSAGEQUEUESIZEINBYTES, value); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate(int) maxNbMessagesPerUpdate}. */
    public static void nmaxNbMessagesPerUpdate(long struct, int value) { memPutInt(struct + RMTSettings.MAXNBMESSAGESPERUPDATE, value); }
    /** Unsafe version of {@link #_malloc(RMTMallocI) _malloc}. */
    public static void n_malloc(long struct, RMTMallocI value) { memPutAddress(struct + RMTSettings._MALLOC, value.address()); }
    /** Unsafe version of {@link #realloc(RMTReallocI) realloc}. */
    public static void nrealloc(long struct, RMTReallocI value) { memPutAddress(struct + RMTSettings.REALLOC, value.address()); }
    /** Unsafe version of {@link #_free(RMTFreeI) _free}. */
    public static void n_free(long struct, RMTFreeI value) { memPutAddress(struct + RMTSettings._FREE, value.address()); }
    /** Unsafe version of {@link #mm_context(long) mm_context}. */
    public static void nmm_context(long struct, long value) { memPutAddress(struct + RMTSettings.MM_CONTEXT, value); }
    /** Unsafe version of {@link #input_handler(RMTInputHandlerI) input_handler}. */
    public static void ninput_handler(long struct, @Nullable RMTInputHandlerI value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #sampletree_handler(RMTSampleTreeHandlerI) sampletree_handler}. */
    public static void nsampletree_handler(long struct, @Nullable RMTSampleTreeHandlerI value) { memPutAddress(struct + RMTSettings.SAMPLETREE_HANDLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #sampletree_context(long) sampletree_context}. */
    public static void nsampletree_context(long struct, long value) { memPutAddress(struct + RMTSettings.SAMPLETREE_CONTEXT, value); }
    /** Unsafe version of {@link #snapshot_callback(RMTPropertyHandlerI) snapshot_callback}. */
    public static void nsnapshot_callback(long struct, @Nullable RMTPropertyHandlerI value) { memPutAddress(struct + RMTSettings.SNAPSHOT_CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #snapshot_context(long) snapshot_context}. */
    public static void nsnapshot_context(long struct, long value) { memPutAddress(struct + RMTSettings.SNAPSHOT_CONTEXT, value); }
    /** Unsafe version of {@link #input_handler_context(long) input_handler_context}. */
    public static void ninput_handler_context(long struct, long value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT, value); }
    /** Unsafe version of {@link #logPath(ByteBuffer) logPath}. */
    public static void nlogPath(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + RMTSettings.LOGPATH, memAddressSafe(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + RMTSettings._MALLOC));
        check(memGetAddress(struct + RMTSettings.REALLOC));
        check(memGetAddress(struct + RMTSettings._FREE));
    }

}