/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event notifying the change of user presence.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataUserPresenceChangedEXT} event is queued for retrieval using {@link XR10#xrPollEvent PollEvent} when the user presence is changed, as well as when a session starts running.</p>
 * 
 * <p>Receiving {@link XrEventDataUserPresenceChangedEXT} with the {@code isUserPresent} is {@link XR10#XR_TRUE TRUE} indicates that the system has detected the presence of a user in the XR experience. For example, this may indicate that the user has put on the headset, or has entered the tracking area of a non-head-worn XR system.</p>
 * 
 * <p>Receiving {@link XrEventDataUserPresenceChangedEXT} with the {@code isUserPresent} is {@link XR10#XR_FALSE FALSE} indicates that the system has detected the absence of a user in the XR experience. For example, this may indicate that the user has removed the headset or has stepped away from the tracking area of a non-head-worn XR system.</p>
 * 
 * <p>The runtime <b>must</b> queue this event upon a successful call to the {@link XR10#xrBeginSession BeginSession} function, regardless of the value of {@code isUserPresent}, so that the application can be in sync on the state when a session begins running.</p>
 * 
 * <p>The runtime <b>must</b> return a valid {@code XrSession} handle for <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#session-running">a running session</a>.</p>
 * 
 * <p>After the application calls {@link XR10#xrEndSession EndSession}, a <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#session-running">running session</a> is ended and the runtime <b>must</b> not enqueue any more user presence events. Therefore, the application will no longer observe any changes of the {@code isUserPresent} until another <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#session-running">running session</a>.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension does not require any specific correlation between user presence state and session state except that the {@link XrEventDataUserPresenceChangedEXT} event can not be observed without a running session. A runtime may choose to correlate the two states or keep them independent.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTUserPresence XR_EXT_user_presence} extension <b>must</b> be enabled prior to using {@link XrEventDataUserPresenceChangedEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTUserPresence#XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataUserPresenceChangedEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSession {@link #session};
 *     XrBool32 {@link #isUserPresent};
 * }</code></pre>
 */
public class XrEventDataUserPresenceChangedEXT extends Struct<XrEventDataUserPresenceChangedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        ISUSERPRESENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        ISUSERPRESENT = layout.offsetof(3);
    }

    protected XrEventDataUserPresenceChangedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataUserPresenceChangedEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataUserPresenceChangedEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataUserPresenceChangedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataUserPresenceChangedEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrSession} that is receiving the notification. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** an {@code XrBool32} value for new state of user presence after the change. */
    @NativeType("XrBool32")
    public boolean isUserPresent() { return nisUserPresent(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataUserPresenceChangedEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTUserPresence#XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT} value to the {@link #type} field. */
    public XrEventDataUserPresenceChangedEXT type$Default() { return type(EXTUserPresence.XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataUserPresenceChangedEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #session} field. */
    public XrEventDataUserPresenceChangedEXT session(XrSession value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@link #isUserPresent} field. */
    public XrEventDataUserPresenceChangedEXT isUserPresent(@NativeType("XrBool32") boolean value) { nisUserPresent(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataUserPresenceChangedEXT set(
        int type,
        long next,
        XrSession session,
        boolean isUserPresent
    ) {
        type(type);
        next(next);
        session(session);
        isUserPresent(isUserPresent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataUserPresenceChangedEXT set(XrEventDataUserPresenceChangedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataUserPresenceChangedEXT malloc() {
        return new XrEventDataUserPresenceChangedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataUserPresenceChangedEXT calloc() {
        return new XrEventDataUserPresenceChangedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataUserPresenceChangedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataUserPresenceChangedEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance for the specified memory address. */
    public static XrEventDataUserPresenceChangedEXT create(long address) {
        return new XrEventDataUserPresenceChangedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataUserPresenceChangedEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataUserPresenceChangedEXT(address, null);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataUserPresenceChangedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataUserPresenceChangedEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataUserPresenceChangedEXT malloc(MemoryStack stack) {
        return new XrEventDataUserPresenceChangedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataUserPresenceChangedEXT calloc(MemoryStack stack) {
        return new XrEventDataUserPresenceChangedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataUserPresenceChangedEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataUserPresenceChangedEXT.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataUserPresenceChangedEXT.SESSION); }
    /** Unsafe version of {@link #isUserPresent}. */
    public static int nisUserPresent(long struct) { return memGetInt(struct + XrEventDataUserPresenceChangedEXT.ISUSERPRESENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataUserPresenceChangedEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataUserPresenceChangedEXT.NEXT, value); }
    /** Unsafe version of {@link #session(XrSession) session}. */
    public static void nsession(long struct, XrSession value) { memPutAddress(struct + XrEventDataUserPresenceChangedEXT.SESSION, value.address()); }
    /** Unsafe version of {@link #isUserPresent(boolean) isUserPresent}. */
    public static void nisUserPresent(long struct, int value) { memPutInt(struct + XrEventDataUserPresenceChangedEXT.ISUSERPRESENT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataUserPresenceChangedEXT.SESSION));
    }

    // -----------------------------------

    /** An array of {@link XrEventDataUserPresenceChangedEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataUserPresenceChangedEXT, Buffer> implements NativeResource {

        private static final XrEventDataUserPresenceChangedEXT ELEMENT_FACTORY = XrEventDataUserPresenceChangedEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataUserPresenceChangedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataUserPresenceChangedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrEventDataUserPresenceChangedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataUserPresenceChangedEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataUserPresenceChangedEXT.ntype(address()); }
        /** @return the value of the {@link XrEventDataUserPresenceChangedEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataUserPresenceChangedEXT.nnext(address()); }
        /** @return the value of the {@link XrEventDataUserPresenceChangedEXT#session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataUserPresenceChangedEXT.nsession(address()); }
        /** @return the value of the {@link XrEventDataUserPresenceChangedEXT#isUserPresent} field. */
        @NativeType("XrBool32")
        public boolean isUserPresent() { return XrEventDataUserPresenceChangedEXT.nisUserPresent(address()) != 0; }

        /** Sets the specified value to the {@link XrEventDataUserPresenceChangedEXT#type} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataUserPresenceChangedEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTUserPresence#XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT} value to the {@link XrEventDataUserPresenceChangedEXT#type} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer type$Default() { return type(EXTUserPresence.XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT); }
        /** Sets the specified value to the {@link XrEventDataUserPresenceChangedEXT#next} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataUserPresenceChangedEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataUserPresenceChangedEXT#session} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer session(XrSession value) { XrEventDataUserPresenceChangedEXT.nsession(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataUserPresenceChangedEXT#isUserPresent} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer isUserPresent(@NativeType("XrBool32") boolean value) { XrEventDataUserPresenceChangedEXT.nisUserPresent(address(), value ? 1 : 0); return this; }

    }

}