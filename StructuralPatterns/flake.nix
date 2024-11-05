{
  description = "A simple flake.nix for Java development";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils, ... }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = nixpkgs.legacyPackages.${system};
      in
      {
        devShells.default = pkgs.mkShell {
          packages = with pkgs; [
            openjdk17
            maven
          ];

          shellHook = ''
            export JAVA_HOME=${pkgs.openjdk17}
            echo "JAVA_HOME is set to $JAVA_HOME"
            echo "Starting a new shell with Java 17 and Maven"
            echo "Run 'mvn --version' to check Maven version"
          '';

        };
      }
    );
}
