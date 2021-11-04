/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created debug messenger.
 * 
 * <h5>Description</h5>
 * 
 * <p>For each {@code VkDebugUtilsMessengerEXT} that is created the {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::messageSeverity} and {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::messageType} determine when that {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::pfnUserCallback} is called. The process to determine if the user’s {@code pfnUserCallback} is triggered when an event occurs is as follows:</p>
 * 
 * <ul>
 * <li>The implementation will perform a bitwise AND of the event’s {@code VkDebugUtilsMessageSeverityFlagBitsEXT} with the {@code messageSeverity} provided during creation of the {@code VkDebugUtilsMessengerEXT} object.
 * 
 * <ul>
 * <li>If the value is 0, the message is skipped.</li>
 * </ul>
 * </li>
 * <li>The implementation will perform bitwise AND of the event’s {@code VkDebugUtilsMessageTypeFlagBitsEXT} with the {@code messageType} provided during the creation of the {@code VkDebugUtilsMessengerEXT} object.
 * 
 * <ul>
 * <li>If the value is 0, the message is skipped.</li>
 * </ul>
 * </li>
 * <li>The callback will trigger a debug message for the current event</li>
 * </ul>
 * 
 * <p>The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).</p>
 * 
 * <p>An application <b>can</b> receive multiple callbacks if multiple {@code VkDebugUtilsMessengerEXT} objects are created. A callback will always be executed in the same thread as the originating Vulkan call.</p>
 * 
 * <p>A callback <b>can</b> be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pfnUserCallback} <b>must</b> be a valid {@link VkDebugUtilsMessengerCallbackEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code messageSeverity} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} values</li>
 * <li>{@code messageSeverity} <b>must</b> not be 0</li>
 * <li>{@code messageType} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageTypeFlagBitsEXT} values</li>
 * <li>{@code messageType} <b>must</b> not be 0</li>
 * <li>{@code pfnUserCallback} <b>must</b> be a valid {@link VkDebugUtilsMessengerCallbackEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCallbackEXT}, {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsMessengerCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDebugUtilsMessengerCreateFlagsEXT {@link #flags};
 *     VkDebugUtilsMessageSeverityFlagsEXT {@link #messageSeverity};
 *     VkDebugUtilsMessageTypeFlagsEXT {@link #messageType};
 *     {@link VkDebugUtilsMessengerCallbackEXTI PFN_vkDebugUtilsMessengerCallbackEXT} {@link #pfnUserCallback};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VkDebugUtilsMessengerCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MESSAGESEVERITY,
        MESSAGETYPE,
        PFNUSERCALLBACK,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MESSAGESEVERITY = layout.offsetof(3);
        MESSAGETYPE = layout.offsetof(4);
        PFNUSERCALLBACK = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkDebugUtilsMessengerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** 0 and is reserved for future use. */
    @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) will cause this callback to be called. */
    @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
    public int messageSeverity() { return nmessageSeverity(address()); }
    /** a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called. */
    @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
    public int messageType() { return nmessageType(address()); }
    /** the application callback function to call. */
    @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
    public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() { return npfnUserCallback(address()); }
    /** user data to be passed to the callback. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugUtilsMessengerCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugUtilsMessengerCreateInfoEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDebugUtilsMessengerCreateInfoEXT flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #messageSeverity} field. */
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { nmessageSeverity(address(), value); return this; }
    /** Sets the specified value to the {@link #messageType} field. */
    public VkDebugUtilsMessengerCreateInfoEXT messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) { nmessageType(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnUserCallback} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) { npfnUserCallback(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsMessengerCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int messageSeverity,
        int messageType,
        VkDebugUtilsMessengerCallbackEXTI pfnUserCallback,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        messageSeverity(messageSeverity);
        messageType(messageType);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsMessengerCreateInfoEXT set(VkDebugUtilsMessengerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCreateInfoEXT malloc() {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCreateInfoEXT calloc() {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsMessengerCreateInfoEXT create(long address) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsMessengerCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #messageSeverity}. */
    public static int nmessageSeverity(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITY); }
    /** Unsafe version of {@link #messageType}. */
    public static int nmessageType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGETYPE); }
    /** Unsafe version of {@link #pfnUserCallback}. */
    public static VkDebugUtilsMessengerCallbackEXT npfnUserCallback(long struct) { return VkDebugUtilsMessengerCallbackEXT.create(memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #messageSeverity(int) messageSeverity}. */
    public static void nmessageSeverity(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITY, value); }
    /** Unsafe version of {@link #messageType(int) messageType}. */
    public static void nmessageType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCreateInfoEXT.MESSAGETYPE, value); }
    /** Unsafe version of {@link #pfnUserCallback(VkDebugUtilsMessengerCallbackEXTI) pfnUserCallback}. */
    public static void npfnUserCallback(long struct, VkDebugUtilsMessengerCallbackEXTI value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK, value.address()); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PUSERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugUtilsMessengerCreateInfoEXT.PFNUSERCALLBACK));
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsMessengerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsMessengerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsMessengerCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsMessengerCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsMessengerCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#flags} field. */
        @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
        public int flags() { return VkDebugUtilsMessengerCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#messageSeverity} field. */
        @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
        public int messageSeverity() { return VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#messageType} field. */
        @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
        public int messageType() { return VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#pfnUserCallback} field. */
        @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
        public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() { return VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCreateInfoEXT#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkDebugUtilsMessengerCreateInfoEXT.npUserData(address()); }

        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#sType} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsMessengerCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@link VkDebugUtilsMessengerCreateInfoEXT#sType} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#pNext} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsMessengerCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#flags} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#messageSeverity} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#messageType} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#pfnUserCallback} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) { VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCreateInfoEXT#pUserData} field. */
        public VkDebugUtilsMessengerCreateInfoEXT.Buffer pUserData(@NativeType("void *") long value) { VkDebugUtilsMessengerCreateInfoEXT.npUserData(address(), value); return this; }

    }

}