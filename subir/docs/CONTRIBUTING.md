# Guía de colaboración — Vitalis SV

Reglas del grupo para trabajar en el repositorio. Desde la Entrega 2 **nadie trabaja
directamente en `main`**: todo cambio entra por una rama y un pull request.

## 1. Flujo de trabajo (ramas + pull request)

1. Actualizar `main` local y crear una rama para la tarea:
   ```bash
   git switch main
   git pull
   git switch -c docs/adr-0001
   ```
2. Hacer los cambios y confirmarlos con el formato de la sección 3:
   ```bash
   git add docs/adr/0001-estrategias-de-validacion-de-citas.md
   git commit -m "docs(adr): add ADR 0001 on appointment validation strategies"
   ```
3. Subir la rama y abrir el pull request en GitHub (de la rama hacia `main`):
   ```bash
   git push -u origin docs/adr-0001
   ```
4. Esperar a que el flujo **CI** salga en verde y que otro integrante revise el PR.
5. Hacer el merge desde GitHub y borrar la rama. Luego, `git switch main && git pull`.

Está prohibido hacer `git push` a `main` o commits directos sobre `main`.

### Nombres de ramas
`<tipo>/<descripcion-corta>` en minúsculas y con guiones. Ejemplos:
`build/maven-skeleton`, `feat/citas-domain`, `test/citas-validation`,
`ci/github-actions`, `docs/adr-0001`, `docs/entrega2-pdf`.

## 2. Plantilla de commit

El repositorio incluye `.gitmessage`. Para activarla (una sola vez, en cada computadora):
```bash
git config commit.template .gitmessage
```
Después, `git commit` (sin `-m`) abre el editor con la plantilla.

## 3. Formato de commits: Conventional Commits (en inglés)

Especificación: https://www.conventionalcommits.org

```
<type>(<scope>): <description>

[optional body]

[optional footer]
```

- Los mensajes se escriben **en inglés**.
- La descripción va en **modo imperativo**, en minúsculas, sin punto final y de máximo 72 caracteres
  ("add", "fix", "update"; no "added" ni "adds").
- El `scope` es opcional: `citas`, `adr`, `ci`, `docs`, `pom`, etc.

| Tipo | Cuándo usarlo |
|------|---------------|
| `feat` | Nueva funcionalidad |
| `fix` | Corrección de un error |
| `docs` | Solo documentación (README, ADR, PDF, guías) |
| `test` | Agregar o modificar pruebas |
| `build` | Maven, dependencias, `pom.xml` |
| `ci` | Flujos de GitHub Actions |
| `refactor` | Cambio de código que no altera el comportamiento |
| `style` | Formato, espacios, sin cambios de lógica |
| `chore` | Tareas varias (por ejemplo, `.gitignore`) |
| `perf` | Mejora de rendimiento |

### Ejemplos para este proyecto
```
build: add Maven project skeleton with Java 21 and JUnit 5
feat(citas): add in-memory appointment validation
test(citas): cover double-booking rules for doctor and patient
ci: add GitHub Actions workflow to run Maven tests
docs(adr): add ADR 0001 on appointment validation strategies
docs: add contributing guide and commit message template
fix(citas): reject patient with two active appointments in the same slot
chore: add .gitignore for Maven and IntelliJ files
```

Si el cambio rompe algo existente se marca con `!` o con un pie `BREAKING CHANGE:`:
```
feat(citas)!: change reservar() to return a result object
```

## 4. Etiquetas (tags)
Las etiquetas de entrega se crean sobre `main`, después de fusionar los PR:
```bash
git switch main && git pull
git tag v0.2-marco-metodologia
git push origin v0.2-marco-metodologia
```
