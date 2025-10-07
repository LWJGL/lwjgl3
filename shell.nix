{
  pkgs ?
    import
      (fetchTarball "https://github.com/NixOS/nixpkgs/archive/647e5c14cbd5067f44ac86b74f014962df460840.tar.gz")
      { },
}:
let
  libs = with pkgs; [
    xorg.libX11
    xorg.libXcursor
    xorg.libXext
    xorg.libXrandr
    xorg.libXxf86vm
    wayland
    libxkbcommon
    gtk3
    gtk3-x11
    gdk-pixbuf
    dbus
  ];
  runtimeLibs = with pkgs; lib.makeLibraryPath libs;
in
pkgs.mkShell {
  shellHook = ''
    export LD_LIBRARY_PATH=${runtimeLibs}:$LD_LIBRARY_PATH
    PKG_CONFIG_OUT="$(pkg-config --cflags --libs gtk+-3.0 gtk+-x11-3.0 dbus-1)"
    NIX_CFLAGS_COMPILE="$PKG_CONFIG_OUT $NIX_CFLAGS_COMPILE"
  '';

  buildInputs = with pkgs; libs ++ [ pkg-config ];

  packages = with pkgs; [
    jdk21
    ant
    kotlin
  ];
}
