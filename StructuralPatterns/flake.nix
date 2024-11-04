{
  description = "A simple flake.nix for Rust development";

  outputs = { self, nixpkgs }: {

    devShells.default = nixpkgs.lib.mkShell {
      packages = with nixpkgs; [
        rustup 
        rust-analyzer 
        cargo-watch 
        clippy 
        rustfmt
      ];

      shellHook = ''
        # Set up rustup default to install stable Rust toolchain
        if ! command -v rustc &> /dev/null; then
          rustup default stable
        fi
      '';
    };
  };
}
