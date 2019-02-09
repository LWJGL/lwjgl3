/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure to fill in to modify Remotery default settings.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code port} &ndash; which port to listen for incoming connections on</li>
 * <li>{@code reuse_open_port} &ndash; 
 * when this server exits it can leave the port open in {@code TIME_WAIT} state for a while. This forces subsequent server bind attempts to fail when
 * restarting. If you find restarts fail repeatedly with bind attempts, set this to true to forcibly reuse the open port.</li>
 * <li>{@code limit_connections_to_localhost} &ndash; 
 * Only allow connections on localhost?
 * 
 * <p>For dev builds you may want to access your game from other devices but if you distribute a game to your players with Remotery active, probably best to
 * limit connections to localhost.</p></li>
 * <li>{@code msSleepBetweenServerUpdates} &ndash; how long to sleep between server updates, hopefully trying to give a little CPU back to other threads</li>
 * <li>{@code messageQueueSizeInBytes} &ndash; size of the internal message queues Remotery uses. Will be rounded to page granularity of 64k.</li>
 * <li>{@code maxNbMessagesPerUpdate} &ndash; 
 * if the user continuously pushes to the message queue, the server network code won't get a chance to update unless there's an upper-limit on how many
 * messages can be consumed per loop</li>
 * <li>{@code _malloc} &ndash; callback pointer for memory allocation</li>
 * <li>{@code realloc} &ndash; callback pointer for memory allocation</li>
 * <li>{@code _free} &ndash; callback pointer for memory allocation</li>
 * <li>{@code mm_context} &ndash; memory allocation context pointer</li>
 * <li>{@code input_handler} &ndash; callback pointer for receiving input from the Remotery console</li>
 * <li>{@code input_handler_context} &ndash; context pointer that gets sent to Remotery console callback function</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rmtSettings {
 *     rmtU16 port;
 *     rmtBool reuse_open_port;
 *     rmtBool limit_connections_to_localhost;
 *     rmtU32 msSleepBetweenServerUpdates;
 *     rmtU32 messageQueueSizeInBytes;
 *     rmtU32 maxNbMessagesPerUpdate;
 *     {@link RMTMallocI rmtMallocPtr} _malloc;
 *     {@link RMTReallocI rmtReallocPtr} realloc;
 *     {@link RMTFreeI rmtFreePtr} _free;
 *     void * mm_context;
 *     {@link RMTInputHandlerI rmtInputHandlerPtr} input_handler;
 *     void * input_handler_context;
 *     rmtPStr logFilename;
 * }</code></pre>
 */
@NativeType("struct rmtSettings")
public class RMTSettings extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PORT,
        REUSE_OPEN_PORT,
        LIMIT_CONNECTIONS_TO_LOCALHOST,
        MSSLEEPBETWEENSERVERUPDATES,
        MESSAGEQUEUESIZEINBYTES,
        MAXNBMESSAGESPERUPDATE,
        _MALLOC,
        REALLOC,
        _FREE,
        MM_CONTEXT,
        INPUT_HANDLER,
        INPUT_HANDLER_CONTEXT,
        LOGFILENAME;

    static {
        Layout layout = __struct(
            __member(2),
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
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PORT = layout.offsetof(0);
        REUSE_OPEN_PORT = layout.offsetof(1);
        LIMIT_CONNECTIONS_TO_LOCALHOST = layout.offsetof(2);
        MSSLEEPBETWEENSERVERUPDATES = layout.offsetof(3);
        MESSAGEQUEUESIZEINBYTES = layout.offsetof(4);
        MAXNBMESSAGESPERUPDATE = layout.offsetof(5);
        _MALLOC = layout.offsetof(6);
        REALLOC = layout.offsetof(7);
        _FREE = layout.offsetof(8);
        MM_CONTEXT = layout.offsetof(9);
        INPUT_HANDLER = layout.offsetof(10);
        INPUT_HANDLER_CONTEXT = layout.offsetof(11);
        LOGFILENAME = layout.offsetof(12);
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

    /** Returns the value of the {@code port} field. */
    @NativeType("rmtU16")
    public short port() { return nport(address()); }
    /** Returns the value of the {@code reuse_open_port} field. */
    @NativeType("rmtBool")
    public int reuse_open_port() { return nreuse_open_port(address()); }
    /** Returns the value of the {@code limit_connections_to_localhost} field. */
    @NativeType("rmtBool")
    public int limit_connections_to_localhost() { return nlimit_connections_to_localhost(address()); }
    /** Returns the value of the {@code msSleepBetweenServerUpdates} field. */
    @NativeType("rmtU32")
    public int msSleepBetweenServerUpdates() { return nmsSleepBetweenServerUpdates(address()); }
    /** Returns the value of the {@code messageQueueSizeInBytes} field. */
    @NativeType("rmtU32")
    public int messageQueueSizeInBytes() { return nmessageQueueSizeInBytes(address()); }
    /** Returns the value of the {@code maxNbMessagesPerUpdate} field. */
    @NativeType("rmtU32")
    public int maxNbMessagesPerUpdate() { return nmaxNbMessagesPerUpdate(address()); }
    /** Returns the value of the {@code _malloc} field. */
    @NativeType("rmtMallocPtr")
    public RMTMalloc _malloc() { return n_malloc(address()); }
    /** Returns the value of the {@code realloc} field. */
    @NativeType("rmtReallocPtr")
    public RMTRealloc realloc() { return nrealloc(address()); }
    /** Returns the value of the {@code _free} field. */
    @NativeType("rmtFreePtr")
    public RMTFree _free() { return n_free(address()); }
    /** Returns the value of the {@code mm_context} field. */
    @NativeType("void *")
    public long mm_context() { return nmm_context(address()); }
    /** Returns the value of the {@code input_handler} field. */
    @NativeType("rmtInputHandlerPtr")
    public RMTInputHandler input_handler() { return ninput_handler(address()); }
    /** Returns the value of the {@code input_handler_context} field. */
    @NativeType("void *")
    public long input_handler_context() { return ninput_handler_context(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code logFilename} field. */
    @NativeType("rmtPStr")
    public ByteBuffer logFilename() { return nlogFilename(address()); }
    /** Decodes the null-terminated string pointed to by the {@code logFilename} field. */
    @NativeType("rmtPStr")
    public String logFilenameString() { return nlogFilenameString(address()); }

    /** Sets the specified value to the {@code port} field. */
    public RMTSettings port(@NativeType("rmtU16") short value) { nport(address(), value); return this; }
    /** Sets the specified value to the {@code reuse_open_port} field. */
    public RMTSettings reuse_open_port(@NativeType("rmtBool") int value) { nreuse_open_port(address(), value); return this; }
    /** Sets the specified value to the {@code limit_connections_to_localhost} field. */
    public RMTSettings limit_connections_to_localhost(@NativeType("rmtBool") int value) { nlimit_connections_to_localhost(address(), value); return this; }
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
    public RMTSettings input_handler(@NativeType("rmtInputHandlerPtr") RMTInputHandlerI value) { ninput_handler(address(), value); return this; }
    /** Sets the specified value to the {@code input_handler_context} field. */
    public RMTSettings input_handler_context(@NativeType("void *") long value) { ninput_handler_context(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code logFilename} field. */
    public RMTSettings logFilename(@NativeType("rmtPStr") ByteBuffer value) { nlogFilename(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RMTSettings set(
        short port,
        int reuse_open_port,
        int limit_connections_to_localhost,
        int msSleepBetweenServerUpdates,
        int messageQueueSizeInBytes,
        int maxNbMessagesPerUpdate,
        RMTMallocI _malloc,
        RMTReallocI realloc,
        RMTFreeI _free,
        long mm_context,
        RMTInputHandlerI input_handler,
        long input_handler_context,
        ByteBuffer logFilename
    ) {
        port(port);
        reuse_open_port(reuse_open_port);
        limit_connections_to_localhost(limit_connections_to_localhost);
        msSleepBetweenServerUpdates(msSleepBetweenServerUpdates);
        messageQueueSizeInBytes(messageQueueSizeInBytes);
        maxNbMessagesPerUpdate(maxNbMessagesPerUpdate);
        _malloc(_malloc);
        realloc(realloc);
        _free(_free);
        mm_context(mm_context);
        input_handler(input_handler);
        input_handler_context(input_handler_context);
        logFilename(logFilename);

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
        return wrap(RMTSettings.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RMTSettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTSettings calloc() {
        return wrap(RMTSettings.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RMTSettings} instance allocated with {@link BufferUtils}. */
    public static RMTSettings create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RMTSettings.class, memAddress(container), container);
    }

    /** Returns a new {@code RMTSettings} instance for the specified memory address. */
    public static RMTSettings create(long address) {
        return wrap(RMTSettings.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTSettings createSafe(long address) {
        return address == NULL ? null : wrap(RMTSettings.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code RMTSettings} instance allocated on the thread-local {@link MemoryStack}. */
    public static RMTSettings mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code RMTSettings} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RMTSettings callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code RMTSettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings mallocStack(MemoryStack stack) {
        return wrap(RMTSettings.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RMTSettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings callocStack(MemoryStack stack) {
        return wrap(RMTSettings.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #port}. */
    public static short nport(long struct) { return UNSAFE.getShort(null, struct + RMTSettings.PORT); }
    /** Unsafe version of {@link #reuse_open_port}. */
    public static int nreuse_open_port(long struct) { return UNSAFE.getInt(null, struct + RMTSettings.REUSE_OPEN_PORT); }
    /** Unsafe version of {@link #limit_connections_to_localhost}. */
    public static int nlimit_connections_to_localhost(long struct) { return UNSAFE.getInt(null, struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates}. */
    public static int nmsSleepBetweenServerUpdates(long struct) { return UNSAFE.getInt(null, struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES); }
    /** Unsafe version of {@link #messageQueueSizeInBytes}. */
    public static int nmessageQueueSizeInBytes(long struct) { return UNSAFE.getInt(null, struct + RMTSettings.MESSAGEQUEUESIZEINBYTES); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate}. */
    public static int nmaxNbMessagesPerUpdate(long struct) { return UNSAFE.getInt(null, struct + RMTSettings.MAXNBMESSAGESPERUPDATE); }
    /** Unsafe version of {@link #_malloc}. */
    public static RMTMalloc n_malloc(long struct) { return RMTMalloc.create(memGetAddress(struct + RMTSettings._MALLOC)); }
    /** Unsafe version of {@link #realloc}. */
    public static RMTRealloc nrealloc(long struct) { return RMTRealloc.create(memGetAddress(struct + RMTSettings.REALLOC)); }
    /** Unsafe version of {@link #_free}. */
    public static RMTFree n_free(long struct) { return RMTFree.create(memGetAddress(struct + RMTSettings._FREE)); }
    /** Unsafe version of {@link #mm_context}. */
    public static long nmm_context(long struct) { return memGetAddress(struct + RMTSettings.MM_CONTEXT); }
    /** Unsafe version of {@link #input_handler}. */
    public static RMTInputHandler ninput_handler(long struct) { return RMTInputHandler.create(memGetAddress(struct + RMTSettings.INPUT_HANDLER)); }
    /** Unsafe version of {@link #input_handler_context}. */
    public static long ninput_handler_context(long struct) { return memGetAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT); }
    /** Unsafe version of {@link #logFilename}. */
    public static ByteBuffer nlogFilename(long struct) { return memByteBufferNT1(memGetAddress(struct + RMTSettings.LOGFILENAME)); }
    /** Unsafe version of {@link #logFilenameString}. */
    public static String nlogFilenameString(long struct) { return memASCII(memGetAddress(struct + RMTSettings.LOGFILENAME)); }

    /** Unsafe version of {@link #port(short) port}. */
    public static void nport(long struct, short value) { UNSAFE.putShort(null, struct + RMTSettings.PORT, value); }
    /** Unsafe version of {@link #reuse_open_port(int) reuse_open_port}. */
    public static void nreuse_open_port(long struct, int value) { UNSAFE.putInt(null, struct + RMTSettings.REUSE_OPEN_PORT, value); }
    /** Unsafe version of {@link #limit_connections_to_localhost(int) limit_connections_to_localhost}. */
    public static void nlimit_connections_to_localhost(long struct, int value) { UNSAFE.putInt(null, struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST, value); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates(int) msSleepBetweenServerUpdates}. */
    public static void nmsSleepBetweenServerUpdates(long struct, int value) { UNSAFE.putInt(null, struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES, value); }
    /** Unsafe version of {@link #messageQueueSizeInBytes(int) messageQueueSizeInBytes}. */
    public static void nmessageQueueSizeInBytes(long struct, int value) { UNSAFE.putInt(null, struct + RMTSettings.MESSAGEQUEUESIZEINBYTES, value); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate(int) maxNbMessagesPerUpdate}. */
    public static void nmaxNbMessagesPerUpdate(long struct, int value) { UNSAFE.putInt(null, struct + RMTSettings.MAXNBMESSAGESPERUPDATE, value); }
    /** Unsafe version of {@link #_malloc(RMTMallocI) _malloc}. */
    public static void n_malloc(long struct, RMTMallocI value) { memPutAddress(struct + RMTSettings._MALLOC, value.address()); }
    /** Unsafe version of {@link #realloc(RMTReallocI) realloc}. */
    public static void nrealloc(long struct, RMTReallocI value) { memPutAddress(struct + RMTSettings.REALLOC, value.address()); }
    /** Unsafe version of {@link #_free(RMTFreeI) _free}. */
    public static void n_free(long struct, RMTFreeI value) { memPutAddress(struct + RMTSettings._FREE, value.address()); }
    /** Unsafe version of {@link #mm_context(long) mm_context}. */
    public static void nmm_context(long struct, long value) { memPutAddress(struct + RMTSettings.MM_CONTEXT, check(value)); }
    /** Unsafe version of {@link #input_handler(RMTInputHandlerI) input_handler}. */
    public static void ninput_handler(long struct, RMTInputHandlerI value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER, value.address()); }
    /** Unsafe version of {@link #input_handler_context(long) input_handler_context}. */
    public static void ninput_handler_context(long struct, long value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT, check(value)); }
    /** Unsafe version of {@link #logFilename(ByteBuffer) logFilename}. */
    public static void nlogFilename(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + RMTSettings.LOGFILENAME, memAddress(value));
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
        check(memGetAddress(struct + RMTSettings.MM_CONTEXT));
        check(memGetAddress(struct + RMTSettings.INPUT_HANDLER));
        check(memGetAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT));
        check(memGetAddress(struct + RMTSettings.LOGFILENAME));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

}