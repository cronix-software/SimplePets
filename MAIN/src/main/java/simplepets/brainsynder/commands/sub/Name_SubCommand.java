package simplepets.brainsynder.commands.sub;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import simple.brainsynder.commands.annotations.ICommand;
import simplepets.brainsynder.commands.PetSubCommand;
import simplepets.brainsynder.player.PetOwner;

@ICommand(
        name = "name",
        usage = "&r &r &6[] &7/pet name",
        description = "Change your pets name"
)
public class Name_SubCommand extends PetSubCommand {
    @Override
    public void run(CommandSender sender) {
        if (sender instanceof Player) {
            PetOwner owner = PetOwner.getPetOwner((Player) sender);
            if (owner == null) return;
            owner.renamePet();
        }
    }
}
