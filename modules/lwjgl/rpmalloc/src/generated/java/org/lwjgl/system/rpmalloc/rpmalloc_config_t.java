/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct rpmalloc_config_t {
 *     size_t page_size;
 *     int enable_huge_pages;
 *     int enable_thp;
 *     int disable_decommit;
 *     char const * page_name;
 *     char const * huge_page_name;
 *     int unmap_on_finalize;
 *     int disable_thp;
 * }}</pre>
 */
public class rpmalloc_config_t extends Struct<rpmalloc_config_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAGE_SIZE,
        ENABLE_HUGE_PAGES,
        ENABLE_THP,
        DISABLE_DECOMMIT,
        PAGE_NAME,
        HUGE_PAGE_NAME,
        UNMAP_ON_FINALIZE,
        DISABLE_THP;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAGE_SIZE = layout.offsetof(0);
        ENABLE_HUGE_PAGES = layout.offsetof(1);
        ENABLE_THP = layout.offsetof(2);
        DISABLE_DECOMMIT = layout.offsetof(3);
        PAGE_NAME = layout.offsetof(4);
        HUGE_PAGE_NAME = layout.offsetof(5);
        UNMAP_ON_FINALIZE = layout.offsetof(6);
        DISABLE_THP = layout.offsetof(7);
    }

    protected rpmalloc_config_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected rpmalloc_config_t create(long address, @Nullable ByteBuffer container) {
        return new rpmalloc_config_t(address, container);
    }

    /**
     * Creates a {@code rpmalloc_config_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public rpmalloc_config_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code page_size} field. */
    @NativeType("size_t")
    public long page_size() { return npage_size(address()); }
    /** @return the value of the {@code enable_huge_pages} field. */
    @NativeType("int")
    public boolean enable_huge_pages() { return nenable_huge_pages(address()) != 0; }
    /** @return the value of the {@code enable_thp} field. */
    @NativeType("int")
    public boolean enable_thp() { return nenable_thp(address()) != 0; }
    /** @return the value of the {@code disable_decommit} field. */
    @NativeType("int")
    public boolean disable_decommit() { return ndisable_decommit(address()) != 0; }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code page_name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer page_name() { return npage_name(address()); }
    /** @return the null-terminated string pointed to by the {@code page_name} field. */
    @NativeType("char const *")
    public @Nullable String page_nameString() { return npage_nameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code huge_page_name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer huge_page_name() { return nhuge_page_name(address()); }
    /** @return the null-terminated string pointed to by the {@code huge_page_name} field. */
    @NativeType("char const *")
    public @Nullable String huge_page_nameString() { return nhuge_page_nameString(address()); }
    /** @return the value of the {@code unmap_on_finalize} field. */
    @NativeType("int")
    public boolean unmap_on_finalize() { return nunmap_on_finalize(address()) != 0; }
    /** @return the value of the {@code disable_thp} field. */
    @NativeType("int")
    public boolean disable_thp() { return ndisable_thp(address()) != 0; }

    /** Sets the specified value to the {@code page_size} field. */
    public rpmalloc_config_t page_size(@NativeType("size_t") long value) { npage_size(address(), value); return this; }
    /** Sets the specified value to the {@code enable_huge_pages} field. */
    public rpmalloc_config_t enable_huge_pages(@NativeType("int") boolean value) { nenable_huge_pages(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_thp} field. */
    public rpmalloc_config_t enable_thp(@NativeType("int") boolean value) { nenable_thp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code disable_decommit} field. */
    public rpmalloc_config_t disable_decommit(@NativeType("int") boolean value) { ndisable_decommit(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified encoded string to the {@code page_name} field. */
    public rpmalloc_config_t page_name(@Nullable @NativeType("char const *") ByteBuffer value) { npage_name(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code huge_page_name} field. */
    public rpmalloc_config_t huge_page_name(@Nullable @NativeType("char const *") ByteBuffer value) { nhuge_page_name(address(), value); return this; }
    /** Sets the specified value to the {@code unmap_on_finalize} field. */
    public rpmalloc_config_t unmap_on_finalize(@NativeType("int") boolean value) { nunmap_on_finalize(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code disable_thp} field. */
    public rpmalloc_config_t disable_thp(@NativeType("int") boolean value) { ndisable_thp(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public rpmalloc_config_t set(
        long page_size,
        boolean enable_huge_pages,
        boolean enable_thp,
        boolean disable_decommit,
        @Nullable ByteBuffer page_name,
        @Nullable ByteBuffer huge_page_name,
        boolean unmap_on_finalize,
        boolean disable_thp
    ) {
        page_size(page_size);
        enable_huge_pages(enable_huge_pages);
        enable_thp(enable_thp);
        disable_decommit(disable_decommit);
        page_name(page_name);
        huge_page_name(huge_page_name);
        unmap_on_finalize(unmap_on_finalize);
        disable_thp(disable_thp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public rpmalloc_config_t set(rpmalloc_config_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code rpmalloc_config_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static rpmalloc_config_t malloc() {
        return new rpmalloc_config_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_config_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static rpmalloc_config_t calloc() {
        return new rpmalloc_config_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_config_t} instance allocated with {@link BufferUtils}. */
    public static rpmalloc_config_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new rpmalloc_config_t(memAddress(container), container);
    }

    /** Returns a new {@code rpmalloc_config_t} instance for the specified memory address. */
    public static rpmalloc_config_t create(long address) {
        return new rpmalloc_config_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable rpmalloc_config_t createSafe(long address) {
        return address == NULL ? null : new rpmalloc_config_t(address, null);
    }

    /**
     * Returns a new {@code rpmalloc_config_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_config_t malloc(MemoryStack stack) {
        return new rpmalloc_config_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code rpmalloc_config_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_config_t calloc(MemoryStack stack) {
        return new rpmalloc_config_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #page_size}. */
    public static long npage_size(long struct) { return memGetAddress(struct + rpmalloc_config_t.PAGE_SIZE); }
    /** Unsafe version of {@link #enable_huge_pages}. */
    public static int nenable_huge_pages(long struct) { return memGetInt(struct + rpmalloc_config_t.ENABLE_HUGE_PAGES); }
    /** Unsafe version of {@link #enable_thp}. */
    public static int nenable_thp(long struct) { return memGetInt(struct + rpmalloc_config_t.ENABLE_THP); }
    /** Unsafe version of {@link #disable_decommit}. */
    public static int ndisable_decommit(long struct) { return memGetInt(struct + rpmalloc_config_t.DISABLE_DECOMMIT); }
    /** Unsafe version of {@link #page_name}. */
    public static @Nullable ByteBuffer npage_name(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + rpmalloc_config_t.PAGE_NAME)); }
    /** Unsafe version of {@link #page_nameString}. */
    public static @Nullable String npage_nameString(long struct) { return memASCIISafe(memGetAddress(struct + rpmalloc_config_t.PAGE_NAME)); }
    /** Unsafe version of {@link #huge_page_name}. */
    public static @Nullable ByteBuffer nhuge_page_name(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + rpmalloc_config_t.HUGE_PAGE_NAME)); }
    /** Unsafe version of {@link #huge_page_nameString}. */
    public static @Nullable String nhuge_page_nameString(long struct) { return memASCIISafe(memGetAddress(struct + rpmalloc_config_t.HUGE_PAGE_NAME)); }
    /** Unsafe version of {@link #unmap_on_finalize}. */
    public static int nunmap_on_finalize(long struct) { return memGetInt(struct + rpmalloc_config_t.UNMAP_ON_FINALIZE); }
    /** Unsafe version of {@link #disable_thp}. */
    public static int ndisable_thp(long struct) { return memGetInt(struct + rpmalloc_config_t.DISABLE_THP); }

    /** Unsafe version of {@link #page_size(long) page_size}. */
    public static void npage_size(long struct, long value) { memPutAddress(struct + rpmalloc_config_t.PAGE_SIZE, value); }
    /** Unsafe version of {@link #enable_huge_pages(boolean) enable_huge_pages}. */
    public static void nenable_huge_pages(long struct, int value) { memPutInt(struct + rpmalloc_config_t.ENABLE_HUGE_PAGES, value); }
    /** Unsafe version of {@link #enable_thp(boolean) enable_thp}. */
    public static void nenable_thp(long struct, int value) { memPutInt(struct + rpmalloc_config_t.ENABLE_THP, value); }
    /** Unsafe version of {@link #disable_decommit(boolean) disable_decommit}. */
    public static void ndisable_decommit(long struct, int value) { memPutInt(struct + rpmalloc_config_t.DISABLE_DECOMMIT, value); }
    /** Unsafe version of {@link #page_name(ByteBuffer) page_name}. */
    public static void npage_name(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + rpmalloc_config_t.PAGE_NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #huge_page_name(ByteBuffer) huge_page_name}. */
    public static void nhuge_page_name(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + rpmalloc_config_t.HUGE_PAGE_NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #unmap_on_finalize(boolean) unmap_on_finalize}. */
    public static void nunmap_on_finalize(long struct, int value) { memPutInt(struct + rpmalloc_config_t.UNMAP_ON_FINALIZE, value); }
    /** Unsafe version of {@link #disable_thp(boolean) disable_thp}. */
    public static void ndisable_thp(long struct, int value) { memPutInt(struct + rpmalloc_config_t.DISABLE_THP, value); }

}