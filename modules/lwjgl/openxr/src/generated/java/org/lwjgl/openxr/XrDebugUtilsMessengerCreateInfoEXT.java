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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDebugUtilsMessengerCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrDebugUtilsMessageSeverityFlagsEXT messageSeverities;
 *     XrDebugUtilsMessageTypeFlagsEXT messageTypes;
 *     {@link XrDebugUtilsMessengerCallbackEXTI PFN_xrDebugUtilsMessengerCallbackEXT} userCallback;
 *     void * userData;
 * }</code></pre>
 */
public class XrDebugUtilsMessengerCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESSAGESEVERITIES,
        MESSAGETYPES,
        USERCALLBACK,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MESSAGESEVERITIES = layout.offsetof(2);
        MESSAGETYPES = layout.offsetof(3);
        USERCALLBACK = layout.offsetof(4);
        USERDATA = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrDebugUtilsMessengerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code messageSeverities} field. */
    @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
    public long messageSeverities() { return nmessageSeverities(address()); }
    /** Returns the value of the {@code messageTypes} field. */
    @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
    public long messageTypes() { return nmessageTypes(address()); }
    /** Returns the value of the {@code userCallback} field. */
    @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
    public XrDebugUtilsMessengerCallbackEXT userCallback() { return nuserCallback(address()); }
    /** Returns the value of the {@code userData} field. */
    @NativeType("void *")
    public long userData() { return nuserData(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDebugUtilsMessengerCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrDebugUtilsMessengerCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code messageSeverities} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { nmessageSeverities(address(), value); return this; }
    /** Sets the specified value to the {@code messageTypes} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { nmessageTypes(address(), value); return this; }
    /** Sets the specified value to the {@code userCallback} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { nuserCallback(address(), value); return this; }
    /** Sets the specified value to the {@code userData} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userData(@NativeType("void *") long value) { nuserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsMessengerCreateInfoEXT set(
        int type,
        long next,
        long messageSeverities,
        long messageTypes,
        XrDebugUtilsMessengerCallbackEXTI userCallback,
        long userData
    ) {
        type(type);
        next(next);
        messageSeverities(messageSeverities);
        messageTypes(messageTypes);
        userCallback(userCallback);
        userData(userData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsMessengerCreateInfoEXT set(XrDebugUtilsMessengerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT malloc() {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT calloc() {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance for the specified memory address. */
    public static XrDebugUtilsMessengerCreateInfoEXT create(long address) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrDebugUtilsMessengerCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrDebugUtilsMessengerCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #messageSeverities}. */
    public static long nmessageSeverities(long struct) { return UNSAFE.getLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES); }
    /** Unsafe version of {@link #messageTypes}. */
    public static long nmessageTypes(long struct) { return UNSAFE.getLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES); }
    /** Unsafe version of {@link #userCallback}. */
    public static XrDebugUtilsMessengerCallbackEXT nuserCallback(long struct) { return XrDebugUtilsMessengerCallbackEXT.create(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK)); }
    /** Unsafe version of {@link #userData}. */
    public static long nuserData(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #messageSeverities(long) messageSeverities}. */
    public static void nmessageSeverities(long struct, long value) { UNSAFE.putLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES, value); }
    /** Unsafe version of {@link #messageTypes(long) messageTypes}. */
    public static void nmessageTypes(long struct, long value) { UNSAFE.putLong(null, struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES, value); }
    /** Unsafe version of {@link #userCallback(XrDebugUtilsMessengerCallbackEXTI) userCallback}. */
    public static void nuserCallback(long struct, XrDebugUtilsMessengerCallbackEXTI value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK, value.address()); }
    /** Unsafe version of {@link #userData(long) userData}. */
    public static void nuserData(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK));
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

    // -----------------------------------

    /** An array of {@link XrDebugUtilsMessengerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = XrDebugUtilsMessengerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsMessengerCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsMessengerCreateInfoEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsMessengerCreateInfoEXT.nnext(address()); }
        /** Returns the value of the {@code messageSeverities} field. */
        @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
        public long messageSeverities() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address()); }
        /** Returns the value of the {@code messageTypes} field. */
        @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
        public long messageTypes() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address()); }
        /** Returns the value of the {@code userCallback} field. */
        @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
        public XrDebugUtilsMessengerCallbackEXT userCallback() { return XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address()); }
        /** Returns the value of the {@code userData} field. */
        @NativeType("void *")
        public long userData() { return XrDebugUtilsMessengerCreateInfoEXT.nuserData(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsMessengerCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code messageSeverities} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address(), value); return this; }
        /** Sets the specified value to the {@code messageTypes} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address(), value); return this; }
        /** Sets the specified value to the {@code userCallback} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address(), value); return this; }
        /** Sets the specified value to the {@code userData} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userData(@NativeType("void *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nuserData(address(), value); return this; }

    }

}