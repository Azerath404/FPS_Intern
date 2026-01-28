import GameCanvas from "@/components/GameCanvas";

export default function Home() {
  return (
    <main className="relative w-full h-screen">
      {/* HUD Giao diện (Máu, đạn) sẽ nằm ở đây bằng Tailwind */}
      <div className="absolute top-5 left-5 z-10 text-white font-bold text-2xl">
        CHRONO STORM FPS
      </div>
      
      {/* Engine Game */}
      <GameCanvas />
    </main>
  );
}